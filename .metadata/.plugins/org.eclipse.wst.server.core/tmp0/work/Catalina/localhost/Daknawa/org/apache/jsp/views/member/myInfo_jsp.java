/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-04-19 07:37:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.Member;

public final class myInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/member/../common/menubar.jsp", Long.valueOf(1681886805815L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>내 정보</title>\r\n");
      out.write("<style>\r\n");
      out.write("    .h1 {\r\n");
      out.write("        text-align : center;\r\n");
      out.write("        font-size : 50px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .input, .button2 {\r\n");
      out.write("        width : 400px;\r\n");
      out.write("        height : 45px;\r\n");
      out.write("        border-style : solid;\r\n");
      out.write("        border-width : 2px;\r\n");
      out.write("        font-size : 14px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .input {\r\n");
      out.write("        box-sizing : border-box;\r\n");
      out.write("        margin-bottom : 5px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("	.button1 {\r\n");
      out.write("        width : 100px;\r\n");
      out.write("        height : 44px;\r\n");
      out.write("        box-sizing : border-box;\r\n");
      out.write("        background-color : black;\r\n");
      out.write("        color : white;\r\n");
      out.write("        margin : 0px 0px 6px 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .button2 {\r\n");
      out.write("        background-color : black;\r\n");
      out.write("        color : white;\r\n");
      out.write("        margin : 20px 0px 5px 0px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .button3 {\r\n");
      out.write("        width : 100px;\r\n");
      out.write("        height : 45px;\r\n");
      out.write("        border : 2px solid rgb(255, 37, 37);\r\n");
      out.write("        font-size : 14px;\r\n");
      out.write("        background-color : rgb(255, 37, 37);\r\n");
      out.write("        color : white;\r\n");
      out.write("        margin : 50px 0px 5px 150px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .button1:hover, .button2:hover {\r\n");
      out.write("        background-color : gray;\r\n");
      out.write("        cursor : pointer;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .button3:hover {\r\n");
      out.write("            background-color : orangered;\r\n");
      out.write("            cursor : pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    .div1 {\r\n");
      out.write("        width : 400px;\r\n");
      out.write("        margin : auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    .div1 td {\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        font-size : 14px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #genderM, #genderF { cursor : pointer; }\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');

	
	String contextPath = request.getContextPath(); // "/jsp"
	
	Member loginUser = (Member)session.getAttribute("loginUser"); // 로그인한 유저의 정보
	
	String alertMsg = (String)session.getAttribute("alertMsg"); // alert 메세지
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"english\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>exported project</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta property=\"twitter:card\" content=\"summary_large_image\" />\r\n");
      out.write("<!-- 스타일을 위한 연동 구문 (외부 스타일 방식) -->\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- 기본 동적인 효과를 위한 연동 구문 (외부 js 방식) => 순서 주의!! -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js\"></script> <!-- 온라인 방식 -->\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- CSS only -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"\r\n");
      out.write("	crossorigin=\"anonymous\" />\r\n");
      out.write("	<!-- 기본 동적인 효과를 위한 연동 구문 (외부 js 방식) => 순서 주의!! -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js\"></script> <!-- 온라인 방식 -->\r\n");
      out.write("    <!-- Popper JS -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <!-- Latest compiled JavaScript -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<style data-tag=\"reset-style-sheet\">\r\n");
      out.write("html {\r\n");
      out.write("	line-height: 1.15;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	border-width: 0;\r\n");
      out.write("	border-style: solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p, li, ul, pre, div, h1, h2, h3, h4, h5, h6, figure, blockquote,\r\n");
      out.write("	figcaption {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("	background-color: transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button, input, optgroup, select, textarea {\r\n");
      out.write("	font-family: inherit;\r\n");
      out.write("	font-size: 100%;\r\n");
      out.write("	line-height: 1.15;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button, select {\r\n");
      out.write("	text-transform: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button, [type=\"button\"], [type=\"reset\"], [type=\"submit\"] {\r\n");
      out.write("	-webkit-appearance: button;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button::-moz-focus-inner, [type=\"button\"]::-moz-focus-inner, [type=\"reset\"]::-moz-focus-inner,\r\n");
      out.write("	[type=\"submit\"]::-moz-focus-inner {\r\n");
      out.write("	border-style: none;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:-moz-focus, [type=\"button\"]:-moz-focus, [type=\"reset\"]:-moz-focus,\r\n");
      out.write("	[type=\"submit\"]:-moz-focus {\r\n");
      out.write("	outline: 1px dotted ButtonText;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	color: inherit;\r\n");
      out.write("	text-decoration: inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("	padding: 2px 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html {\r\n");
      out.write("	scroll-behavior: smooth;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style data-tag=\"default-style-sheet\">\r\n");
      out.write("html {\r\n");
      out.write("	font-family: Inter;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("	font-style: normal;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	text-transform: none;\r\n");
      out.write("	letter-spacing: normal;\r\n");
      out.write("	line-height: 1.15;\r\n");
      out.write("	color: var(- -dl-color-gray-black);\r\n");
      out.write("	background-color: var(- -dl-color-gray-white);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-box1 {\r\n");
      out.write("	background-color: #f9f9f9;\r\n");
      out.write("	min-width: 160px;\r\n");
      out.write("	z-index: 1;\r\n");
      out.write("	height: 80px;\r\n");
      out.write("	border: 1px solid #f9f9f9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div {\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("/* navigator 에 대한 작업용 임시스타일 */\r\n");
      out.write("#navigator {\r\n");
      out.write("	width: 1000px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 전체를 감사는 navi */\r\n");
      out.write("#navi {\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	/*\r\n");
      out.write("            p 태그와 마찬가지로 ul 태그 또한 위, 아래로 기본 margin 이 잡혀있음\r\n");
      out.write("            또한 ul 태그는 padding이 왼쪽에 기본적으로 존재함\r\n");
      out.write("            => margin : 0px; 과 padding : 0px; 으로 margin과 padding을 없애기\r\n");
      out.write("        */\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("	padding: 0px; /* padding 값 조정으로 메뉴 가운데 배치 가능 */\r\n");
      out.write("	height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 메인 메뉴 나타내는 li 태그들 */\r\n");
      out.write("#navi>li {\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 15%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 메뉴 문구를 나타내는 a 태그들 */\r\n");
      out.write("#navi a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: lightcoral;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	font-weight: 900;\r\n");
      out.write("	/*\r\n");
      out.write("                a 태그는 인라인요소이기 때문에\r\n");
      out.write("                width, height 속성이 적용되지 않음\r\n");
      out.write("                => display : block;으로 블럭요소화 시켜줄것임\r\n");
      out.write("            */\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	display: block;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	/*vertical-align : middle;*/ /* verical-align 은 블럭요소에서 적용되지 않음 */\r\n");
      out.write("	line-height: 35px;\r\n");
      out.write("	/*\r\n");
      out.write("                line_height 속성은 블럭요소에 대한 장편조절 속성\r\n");
      out.write("                보통은 블럭요소의 세로길이만큼 주면 알아서 가운데로 옴\r\n");
      out.write("            */\r\n");
      out.write("}\r\n");
      out.write("/* 메뉴에 마우스가 올라갔을 때 추가적인 속성 */\r\n");
      out.write("#navi a:hover {\r\n");
      out.write("	color: crimson;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 서브메뉴에 해당되는 ul에 대한 스타일 */\r\n");
      out.write("#navi>li>ul {\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("	padding: 0px;\r\n");
      out.write("	display: none; /* 평소에는 안보여지게끔 숨김 처리 */\r\n");
      out.write("}\r\n");
      out.write("/* 메인 메뉴에 마우스가 올라가는 순간 서브메뉴가 보여지게끔 스타일 부여*/\r\n");
      out.write("#navi>li:hover>ul {\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 혹시 몰라서 서브메뉴 자체에도 효과 부여 */\r\n");
      out.write("#navi>li>ul:hover {\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 추가적으로 글씨 크기조정, 스타일, ... */\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Inter:wght@100;200;300;400;500;600;700;800;900&amp;display=swap\"\r\n");
      out.write("	data-tag=\"font\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&amp;display=swap\"\r\n");
      out.write("	data-tag=\"font\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./style.css\" />\r\n");
      out.write("<link href=\"resources/css/navbar11.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/ba6f730a41.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div>\r\n");
      out.write("		<div class=\"navbar11-navbar1\">\r\n");
      out.write("			<div class=\"navbar11-container1\">\r\n");
      out.write("				<img onclick=\"location.href='");
      out.print( contextPath );
      out.write("'\" style=\"cursor: pointer\"\r\n");
      out.write("					src=\"resources/css/logoimg+logoname.png\" alt=\"logoI204\"\r\n");
      out.write("					class=\"navbar11-logo\" />\r\n");
      out.write("				<div class=\"navbar11-column1\">\r\n");
      out.write("					<div class=\"navbar11-column2\">\r\n");
      out.write("						<span \r\n");
      out.write("							class=\"navbar11-text TextRegularNormal\" style=\"cursor: pointer\">\r\n");
      out.write("							<div class=\"dropdown\">\r\n");
      out.write("								<button class=\"btn btn-secondary dropdown-toggle\"\r\n");
      out.write("									style=\"background-color: rgba(64, 81, 59, 1); border: 0px; border-radius: 0px;\"\r\n");
      out.write("									type=\"button\" id=\"dropdownMenuButton1\"\r\n");
      out.write("									data-bs-toggle=\"dropdown\" aria-expanded=\"false\">게시판</button>\r\n");
      out.write("								<ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\r\n");
      out.write("									<li><a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/plist.bo?currentPage=1\">자유 게시판</a></li>\r\n");
      out.write("									<li><a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/review.bo?currentPage=1\">사진 게시판</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</span>\r\n");
      out.write("						<div class=\"dropdown\">\r\n");
      out.write("							<button class=\"btn btn-secondary\"\r\n");
      out.write("								onclick=\"location.href='");
      out.print( contextPath );
      out.write("/menu.mn'\"\r\n");
      out.write("								style=\"background-color: rgba(64, 81, 59, 1); border: 0px; border-radius: 0px;\"\r\n");
      out.write("								type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("								aria-expanded=\"false\">메뉴 정보</button>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"dropdown\">\r\n");
      out.write("							<button class=\"btn btn-secondary\"\r\n");
      out.write("								onclick=\"location.href='");
      out.print( contextPath );
      out.write("/list.st?currentPage=1'\"\r\n");
      out.write("								style=\"background-color: rgba(64, 81, 59, 1); border: 0px; border-radius: 0px;\"\r\n");
      out.write("								type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("								aria-expanded=\"false\">매장 정보</button>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"dropdown\">\r\n");
      out.write("							<button class=\"btn btn-secondary dropdown-toggle\"\r\n");
      out.write("								style=\"background-color: rgba(64, 81, 59, 1); border: 0px; border-radius: 0px;\"\r\n");
      out.write("								type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("								aria-expanded=\"false\">더보기</button>\r\n");
      out.write("							<ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\r\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">마이 페이지</a></li>\r\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">문의 하기</a></li>\r\n");
      out.write("\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					");
 if(loginUser == null) { // 로그인 하기 전  
      out.write("\r\n");
      out.write("						<div class=\"navbar11-column3\">\r\n");
      out.write("							<button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/loginPage.me'\"\r\n");
      out.write("								class=\"navbar11-button\" style=\"cursor: pointer\">\r\n");
      out.write("								<span class=\"navbar11-text08 TextRegularNormal\"> <span>로그인</span>\r\n");
      out.write("								</span>\r\n");
      out.write("							</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					");
 } else { // 로그인 한 후 
      out.write("\r\n");
      out.write("						<div class=\"navbar11-column3\">\r\n");
      out.write("							<button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/logout.me'\"\r\n");
      out.write("								class=\"navbar11-button\" style=\"cursor: pointer\">\r\n");
      out.write("								<span class=\"navbar11-text08 TextRegularNormal\"> <span>로그아웃</span>\r\n");
      out.write("								</span>\r\n");
      out.write("							</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					");
 } 
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- alert 스크립트 -->\r\n");
      out.write("	<script>\r\n");
      out.write("		let msg = \"");
      out.print( alertMsg );
      out.write("\";\r\n");
      out.write("		\r\n");
      out.write("		if(msg != \"null\") {\r\n");
      out.write("			alert(msg);\r\n");
      out.write("			");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("		\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");

		String userId = loginUser.getUserId();
		String userNickName = loginUser.getUserNickName();
		String userName = loginUser.getUserName();
		String email = loginUser.getEmail();
		String phone = loginUser.getPhone();
		String birth = (loginUser.getBirth() == null) ? "" : loginUser.getBirth();
		String gender = (loginUser.getGender() == null) ? "" : loginUser.getGender();
		String address = (loginUser.getAddress() == null) ? "" : loginUser.getAddress();
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("    <form id=\"infoUpdate-form\" action=\"update.me\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("        <br><br><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <h1 class=\"h1\">내 정보</h1>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"div1\">\r\n");
      out.write("\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">아이디 *</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><input type=\"text\" value=\"");
      out.print( userId );
      out.write("\" name=\"userId\" class=\"input\" minlength=\"5\" maxlength=\"12\" placeholder=\"5 ~ 12 글자 이내 작성 (영문, 숫자로)\" required readonly></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">비밀번호 *</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><button type=\"button\" class=\"button2\" style=\"margin : 0px 0px 5px 0px;\" onclick=\"location.href = '");
      out.print( contextPath );
      out.write("/updatePwdForm.me'\">변경하러가기</button></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">닉네임 설정 *</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><input type=\"text\" value=\"");
      out.print( userNickName );
      out.write("\" name=\"userNickname\" class=\"input\" minlength=\"2\" maxlength=\"10\" placeholder=\"2 ~ 10 글자 이내 작성 (영문, 숫자, 한글)\" required></td>\r\n");
      out.write("            	<td><button type=\"button\" class=\"button1\" onclick=\"nickNameCheck();\">중복확인</button></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">이름 *</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><input type=\"text\" value=\"");
      out.print( userName );
      out.write("\" name=\"userName\" class=\"input\" minlength=\"2\" maxlength=\"10\" required></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">이메일 *</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><input type=\"email\" value=\"");
      out.print( email );
      out.write("\" name=\"email\" class=\"input\" required></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">전화번호 *</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><input type=\"text\" value=\"");
      out.print( phone );
      out.write("\" name=\"phone\" class=\"input\" placeholder=\"(-)를 제외한 숫자만 입력\" required></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">생년월일</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><input type=\"date\" value=\"");
      out.print( birth );
      out.write("\" name=\"birth\" class=\"input\" maxlength=\"10\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">성별</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            	");
 if(gender.equals("남")) { 
      out.write("\r\n");
      out.write("                	<td colspan=\"2\">\r\n");
      out.write("                    	<input type=\"radio\" name=\"gender\" id=\"genderM\" value=\"남\" checked style=\"width : 15px; height : 15px;\"><label for=\"gender\" style=\"font-size : 15px; margin-right : 15px;\">남</label>\r\n");
      out.write("                    	<input type=\"radio\" name=\"gender\" id=\"genderF\" value=\"여\" style=\"width : 15px; height : 15px;\"><label for=\"gender\" style=\"font-size : 15px;\">여</label>\r\n");
      out.write("                	</td>\r\n");
      out.write("                ");
 } else if(gender.equals("여")) { 
      out.write("\r\n");
      out.write("                	<td colspan=\"2\">\r\n");
      out.write("                    	<input type=\"radio\" name=\"gender\" id=\"genderM\" value=\"남\" style=\"width : 15px; height : 15px;\"><label for=\"gender\" style=\"font-size : 15px; margin-right : 15px;\">남</label>\r\n");
      out.write("                    	<input type=\"radio\" name=\"gender\" id=\"genderF\" value=\"여\" checked style=\"width : 15px; height : 15px;\"><label for=\"gender\" style=\"font-size : 15px;\">여</label>\r\n");
      out.write("                	</td>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                	<td colspan=\"2\">\r\n");
      out.write("                    	<input type=\"radio\" name=\"gender\" id=\"genderM\" value=\"남\" style=\"width : 15px; height : 15px;\"><label for=\"gender\" style=\"font-size : 15px; margin-right : 15px;\">남</label>\r\n");
      out.write("                    	<input type=\"radio\" name=\"gender\" id=\"genderF\" value=\"여\" style=\"width : 15px; height : 15px;\"><label for=\"gender\" style=\"font-size : 15px;\">여</label>\r\n");
      out.write("                	</td>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\">주소</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><input type=\"text\" value=\"");
      out.print( address );
      out.write("\" name=\"address\" class=\"input\" maxlength=\"100\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><button type=\"submit\" class=\"button2\" onclick=\"return validate();\" disabled>수정하기</button></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\"><button type=\"button\" class=\"button3\" onclick=\"location.href = '");
      out.print( contextPath );
      out.write("/deleteForm.me'\">회원탈퇴</button></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    function nickNameCheck() {\r\n");
      out.write("		\r\n");
      out.write("		let $userNickname = $(\"#infoUpdate-form input[name=userNickname]\");\r\n");
      out.write("		let regExp = /^[a-zA-Z0-9가-힣]{2,10}$/;\r\n");
      out.write("		\r\n");
      out.write("		console.log($userNickname);\r\n");
      out.write("		\r\n");
      out.write("		if(!regExp.test($userNickname.val())) { // 닉네임 패턴에 맞지 않는 경우\r\n");
      out.write("            \r\n");
      out.write("            alert(\"양식에 맞는 닉네임이 아닙니다. 다시 입력해 주세요!\");\r\n");
      out.write("            $userNickname.focus();\r\n");
      out.write("            \r\n");
      out.write("		} else {\r\n");
      out.write("			\r\n");
      out.write("    		$.ajax({\r\n");
      out.write("    			url : \"nicknameCheck.me\",\r\n");
      out.write("    			type : \"get\",\r\n");
      out.write("    			data : { checkNickname : $userNickname.val() },\r\n");
      out.write("    			success : function(result) {\r\n");
      out.write("    				\r\n");
      out.write("					if(result == \"USNNN\") { // 사용 불가\r\n");
      out.write("						\r\n");
      out.write("						if(\"");
      out.print( userNickName );
      out.write("\" == $userNickname.val()) {\r\n");
      out.write("							\r\n");
      out.write("							let answer = confirm(\"현재 회원님의 닉네임입니다. 그대로 사용하시겠습니까?\");\r\n");
      out.write("							\r\n");
      out.write("							if(answer) { // 닉네임 사용\r\n");
      out.write("								\r\n");
      out.write("								$(\"#infoUpdate-form button[type=submit]\").removeAttr(\"disabled\"); // 회원정보 수정버튼 활성화\r\n");
      out.write("								\r\n");
      out.write("								$userNickname.attr(\"readonly\", true); // 닉네임값을 수정 못하게 확정시키기\r\n");
      out.write("								\r\n");
      out.write("							} else { // 닉네임 사용 X\r\n");
      out.write("								\r\n");
      out.write("								$userNickname.focus();\r\n");
      out.write("\r\n");
      out.write("							}\r\n");
      out.write("							\r\n");
      out.write("						} else {\r\n");
      out.write("					\r\n");
      out.write("							alert(\"이미 존재하거나 탈퇴한 회원의 닉네임입니다.\");\r\n");
      out.write("							$userNickname.focus();\r\n");
      out.write("\r\n");
      out.write("						}\r\n");
      out.write("					\r\n");
      out.write("					} else { // 사용 가능 (\"USNNY\")\r\n");
      out.write("						\r\n");
      out.write("						let answer = confirm(\"사용 가능한 닉네임입니다. 사용하시겠습니까?\");\r\n");
      out.write("						\r\n");
      out.write("						if(answer) { // 닉네임 사용\r\n");
      out.write("							\r\n");
      out.write("							$(\"#infoUpdate-form button[type=submit]\").removeAttr(\"disabled\"); // 회원정보 수정버튼 활성화\r\n");
      out.write("							\r\n");
      out.write("							$userNickname.attr(\"readonly\", true); // 닉네임값을 수정 못하게 확정시키기\r\n");
      out.write("							\r\n");
      out.write("						} else { // 닉네임 사용 X\r\n");
      out.write("							\r\n");
      out.write("							$userNickname.focus();\r\n");
      out.write("\r\n");
      out.write("						}\r\n");
      out.write("					}	 		\r\n");
      out.write("    			}\r\n");
      out.write("    		});\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("    \r\n");
      out.write("    function validate() {\r\n");
      out.write("		\r\n");
      out.write("		let userName = document.getElementsByName(\"userName\")[0].value;\r\n");
      out.write("		let phone = document.getElementsByName(\"phone\")[0].value;\r\n");
      out.write("\r\n");
      out.write("		let regExp = /^[가-힣]{2,10}$/;\r\n");
      out.write("		\r\n");
      out.write("		if(!regExp.test(userName)) { // 이름 패턴에 맞지 않는 경우\r\n");
      out.write("            \r\n");
      out.write("            alert(\"양식에 맞는 이름이 아닙니다. 다시 입력해 주세요!\");\r\n");
      out.write("\r\n");
      out.write("            // 사용자에게 이름 다시 입력을 유도   \r\n");
      out.write("            document.getElementsByName(\"userName\")[0].select();\r\n");
      out.write("\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("		\r\n");
      out.write("		regExp = /^[0-9]{11}$/;\r\n");
      out.write("		\r\n");
      out.write("		if(!regExp.test(phone)) { // 전화번호 패턴에 맞지 않는 경우\r\n");
      out.write("            \r\n");
      out.write("            alert(\"양식에 맞는 전화번호가 아닙니다. (-)를 제외한 숫자로만 입력해 주세요!\");\r\n");
      out.write("\r\n");
      out.write("            // 사용자에게 전화번호 다시 입력을 유도   \r\n");
      out.write("            document.getElementsByName(\"phone\")[0].select();\r\n");
      out.write("\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("		\r\n");
      out.write("		return true;\r\n");
      out.write("	}\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.4.js\" integrity=\"sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
