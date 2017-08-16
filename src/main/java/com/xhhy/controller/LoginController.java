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
		// ���ñ�����ɫ
		Random random = new Random();
		graphics.setColor(new Color(100, 200, 100));
		// ��仭��
		graphics.fillRect(0, 0, IMG_HEIGHT, IMG_WIDTH);
		graphics.setFont(new Font("����", Font.BOLD, 20));
		// ��֤������
		char[] codeChar = "0123456789".toCharArray();
		// �������
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
		// ��Ӹ�����
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

//ȫ����ѯ
	@RequestMapping("queryUser.do")
	public ModelAndView queryUser(HttpServletRequest request, HttpServletResponse response,
		String username,String password,String remeber) throws Exception{
		System.out.println(username);
		//��ȡ��֤������
				String code = "";
				String loginval = request.getParameter("loginval");
				//��ȡ��֤��
				Cookie[] cookies = request.getCookies();
				for(Cookie cookie : cookies){
					if(cookie.getName().equals("code")){
					   code = cookie.getValue();
					}
				}
				if(code.toLowerCase().equals(loginval.toLowerCase())){
					System.out.println("��֤����֤�ɹ�");
					@SuppressWarnings("rawtypes")
					Map map = new HashMap();
					map.put("username", username);
					map.put("password", password);
					UserBean user = loginService.queryUser(map);
			
					
					/*List<MenuBean> menus = userService.login_menus(user.getRole().getRole_id());*/
					if(user!=null/*&& user.getRole().getRole_sort()!= 0*/){
						System.out.println("��¼�ɹ�");
						
						if("1".equals(remeber)){
						
							//��ѡ , ����Cookie
							Cookie cookie1 = new Cookie("username",username);
							Cookie cookie2 = new Cookie("password",password);
							cookie1.setPath("/login");
							cookie1.setMaxAge(7 * 24 * 60 * 60);
							cookie2.setPath("/login");
							cookie2.setMaxAge(7 * 24 * 60 * 60);
							response.addCookie(cookie1);
							response.addCookie(cookie2);
						}
						// �����¼����Ϣ�� session
						HttpSession session = request.getSession();
						session.setAttribute("loginUser", user);
						
						// ��¼�ɹ� ��Ҫ�־û�Cookie д��Cookie��ʱ����Ҫ��д��URL��д��ʱ��Сд�ģ�
						Cookie cookie = new Cookie("JSESSIONID",session.getId());
						cookie.setMaxAge(30*60);// cookie�ĳ־û�ʱ�� Ϊ 30��
						cookie.setPath("/login");// ������Ч·��
						response.addCookie(cookie);
						/*session.setAttribute("menus", menus);*/
						request.getRequestDispatcher("/index.jsp").forward(request, response);
					}else{
						System.out.println("��¼ʧ��");
						request.setAttribute("errorlogin", "�û������������");
						request.getRequestDispatcher("/logino.jsp").forward(request, response);
					}
				}else{
					System.out.println("��֤����֤ʧ��");
					request.getRequestDispatcher("/logino.jsp").forward(request, response);
				
				}
				ModelAndView mav = new ModelAndView("/right.jsp");
				return mav;
			
}
	
	/*private  int  width=180;
	private  int  height=40;
	
    //  �ַ��ĳ���
	char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',  
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',  
            'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	
	@RequestMapping("check.do")
	public void check(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//����һ��ͼƬ
				// ����
				BufferedImage  bi = new  BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
				// ����������ϲ���һ������
				Graphics2D  g = bi.createGraphics();
				// �趨�����С
				Font font = new Font("Fixedsys", Font.PLAIN | Font.BOLD, height-3);
				g.setFont(font);
				// ����������ɫ
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, width, height);
				// ����һ���߿�
				g.setColor(Color.BLACK);
				g.drawRect(0, 0, width-2, height-2);
				// ��������
				Random   r = new  Random();
				
				for(int i = 0;i<20;i++){
					int x = r.nextInt(width);
					int y = r.nextInt(height);
					int x1 = r.nextInt(width-12);
					int y1 = r.nextInt(height-12);
					g.drawLine(x, y, x1, y1);
				}
				// ������֤��
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
				// �����ɺõ���֤�� ���浽session��
				request.getSession().setAttribute("num", flag.toString());
				//�Ѳ���ͼƬ ��Ӧ�������d
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

		
