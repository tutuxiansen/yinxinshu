package com.xhhy.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.SalmanagerBean;
import com.xhhy.domain.UserBean;
import com.xhhy.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	private LoginService loginService;

	private static final int IMG_HEIGHT = 146;
	private static final int IMG_WIDTH = 42;
	private static final int CODE_LEN = 4;
	private static final int lines = 10;

	@RequestMapping("image.do")
	public void image(HttpServletResponse response,HttpServletRequest request) throws IOException {
		BufferedImage bi = new BufferedImage(IMG_HEIGHT, IMG_WIDTH, BufferedImage.TYPE_INT_RGB);
		//
		Graphics graphics = bi.getGraphics();
		// 设置背景颜色
		Random random = new Random();
		graphics.setColor(new Color(100, 200, 100));
		// 填充画布
		graphics.fillRect(0, 0, IMG_HEIGHT, IMG_WIDTH);
		graphics.setFont(new Font("宋体", Font.BOLD, 20));
		// 验证码内容
		char[] codeChar = "0123456789".toCharArray();
		// 填充内容
		String captcha = "";
		for (int i = 0; i < CODE_LEN; i++) {
			//
			int index = random.nextInt(codeChar.length);
			//
			graphics.setColor(new Color(random.nextInt(150), random.nextInt(200), random.nextInt(255)));
			//
			graphics.drawString(codeChar[index] + "", (i * 20) + 15, 20);
			captcha += codeChar[index];
		}
		// 添加干扰线
		for (int i = 0; i < lines; i++) {
			Color c = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
			graphics.setColor(c);
			graphics.drawLine(random.nextInt(IMG_HEIGHT), random.nextInt(IMG_WIDTH), random.nextInt(IMG_HEIGHT),
					random.nextInt(IMG_WIDTH));
		}
		graphics.dispose();
		Cookie cookie = new Cookie("code", captcha);
		response.addCookie(cookie);
		cookie.setMaxAge(60*60);
		request.getSession().setAttribute("num", captcha.toString());
		response.setContentType("images/png");
		ImageIO.write(bi, "png", response.getOutputStream());
	}

//全部查询
	@RequestMapping("queryUser.do")
	public ModelAndView queryUser(HttpServletRequest request, HttpServletResponse response,
		String username,String password,String remeber) throws Exception{
		System.out.println(username);
		//获取验证码内容
				String code = "";
				String loginval = request.getParameter("loginval");
				//获取验证码
				Cookie[] cookies = request.getCookies();
				for(Cookie cookie : cookies){
					if(cookie.getName().equals("code")){
					   code = cookie.getValue();
					}
				}
				if(code.toLowerCase().equals(loginval.toLowerCase())){
					System.out.println("验证码验证成功");
					@SuppressWarnings("rawtypes")
					Map map = new HashMap();
					map.put("username", username);
					map.put("password", password);
					UserBean user = loginService.queryUser(map);
			
					
					/*List<MenuBean> menus = userService.login_menus(user.getRole().getRole_id());*/
					if(user!=null/*&& user.getRole().getRole_sort()!= 0*/){
						System.out.println("登录成功");
						
						if("1".equals(remeber)){
						
							//勾选 , 创建Cookie
							Cookie cookie1 = new Cookie("username",username);
							Cookie cookie2 = new Cookie("password",password);
							cookie1.setPath("/login");
							cookie1.setMaxAge(7 * 24 * 60 * 60);
							cookie2.setPath("/login");
							cookie2.setMaxAge(7 * 24 * 60 * 60);
							response.addCookie(cookie1);
							response.addCookie(cookie2);
						}
						// 保存登录人信息到 session
						HttpSession session = request.getSession();
						session.setAttribute("loginUser", user);
						
						// 登录成功 需要持久化Cookie 写到Cookie的时候需要大写（URL重写的时候小写的）
						Cookie cookie = new Cookie("JSESSIONID",session.getId());
						cookie.setMaxAge(30*60);// cookie的持久化时间 为 30分
						cookie.setPath("/login");// 设置有效路径
						response.addCookie(cookie);
						/*session.setAttribute("menus", menus);*/
						request.getRequestDispatcher("/index.jsp").forward(request, response);
					}else{
						System.out.println("登录失败");
						request.setAttribute("errorlogin", "用户名或密码错误");
						request.getRequestDispatcher("/logino.jsp").forward(request, response);
					}
				}else{
					System.out.println("验证码验证失败");
					request.getRequestDispatcher("/logino.jsp").forward(request, response);
				
				}
				ModelAndView mav = new ModelAndView("/right.jsp");
				return mav;
			
}
	
	/*private  int  width=180;
	private  int  height=40;
	
    //  字符的出处
	char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',  
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',  
            'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	
	@RequestMapping("check.do")
	public void check(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//产生一个图片
				// 画布
				BufferedImage  bi = new  BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
				// 在这个画布上产生一个画笔
				Graphics2D  g = bi.createGraphics();
				// 设定字体大小
				Font font = new Font("Fixedsys", Font.PLAIN | Font.BOLD, height-3);
				g.setFont(font);
				// 给画布上颜色
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, width, height);
				// 设置一个边框
				g.setColor(Color.BLACK);
				g.drawRect(0, 0, width-2, height-2);
				// 画干扰线
				Random   r = new  Random();
				
				for(int i = 0;i<20;i++){
					int x = r.nextInt(width);
					int y = r.nextInt(height);
					int x1 = r.nextInt(width-12);
					int y1 = r.nextInt(height-12);
					g.drawLine(x, y, x1, y1);
				}
				// 产生验证码
				StringBuffer  flag = new  StringBuffer();
				// 
				for(int i = 0;i<4;i++){
					String  s = String.valueOf(codeSequence[r.nextInt(36)]);
					flag.append(s);
					// 
					int red = r.nextInt(255);
					int blue = r.nextInt(255);
					int green = r.nextInt(255);
					Color  c = new Color(red,blue,green);
					//
					g.setColor(c);
					// 
					g.drawString(s,(width/5)*(i+1),height-3);
					
				}
				// 把生成好的验证码 保存到session中
				request.getSession().setAttribute("num", flag.toString());
				//把产生图片 响应给浏览器d
				response.setContentType("images/png");
				ImageIO.write(bi, "png", response.getOutputStream());
				
			}*/
	@RequestMapping("right.do")
	public ModelAndView right(HttpServletRequest request){

		/*String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))

		{
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))

		{
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))

		{
			ip = request.getRemoteAddr();
		}else{
			ip="192.168.0.1";
		}*/
		String ip="192.168.0.1";
			
		ModelAndView mav = new ModelAndView("/right.jsp");
		mav.addObject("ip", ip);
		return mav;
	}
}

		
