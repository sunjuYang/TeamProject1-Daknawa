/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-05-14 15:39:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.Member;

public final class checkPwdForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/menubar.jsp", Long.valueOf(1682474502979L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1682482873158L));
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
      out.write("<title>닭나와</title>\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"resources/admin/image/x-icon\" href=\"resources/css/public/playground_assets/logo.png\">\r\n");
      out.write("<style>\r\n");
      out.write("    .h1, .h4 { text-align : center; }\r\n");
      out.write("\r\n");
      out.write("    .h1 { font-size : 50px; }\r\n");
      out.write("\r\n");
      out.write("    .h4 { font-size : 20px; }\r\n");
      out.write("\r\n");
      out.write("    .input, .button {\r\n");
      out.write("        width : 400px;\r\n");
      out.write("        height : 45px;\r\n");
      out.write("        border-style : solid;\r\n");
      out.write("        border-width : 2px;\r\n");
      out.write("        border-radius : 5px;\r\n");
      out.write("        font-size : 14px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .input {\r\n");
      out.write("        box-sizing : border-box;\r\n");
      out.write("        border-radius : 5px;\r\n");
      out.write("        margin : 50px 0px 50px 0px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .button {\r\n");
      out.write("        background-color : black;\r\n");
      out.write("        border-radius : 5px;\r\n");
      out.write("        color : white;\r\n");
      out.write("        margin : 5px 0px 5px 0px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .button:hover {\r\n");
      out.write("        background-color : gray;\r\n");
      out.write("        cursor : pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .div1 {\r\n");
      out.write("        width : 400px;\r\n");
      out.write("        text-align: right;\r\n");
      out.write("        margin : auto;\r\n");
      out.write("    }\r\n");
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
      out.write("<title>Daknawa</title>\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"resources/admin/image/x-icon\" href=\"resources/css/public/playground_assets/logo.png\">\r\n");
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
      out.write("<style> \r\n");
      out.write("    html :hover, body :hover, div :hover, select, input, button:hover, a , button { cursor: url('resources/css/public/playground_assets/cursor.cur') 0 10, auto; !important }\r\n");
      out.write("    html :hover, body :hover, div :hover, select, input, button:hover, a , button { cursor: url('resources/css/public/playground_assets/cursor.cur') 0 10, pointer; !important }\r\n");
      out.write("\r\n");
      out.write("	html:active, body:active, div:active , select:active, input:active { cursor: url('resources/css/public/playground_assets/cursor2.cur') 2 40, auto; !important }\r\n");
      out.write("	html:active, body:active, div:active , select:active, input:active { cursor: url('resources/css/public/playground_assets/cursor2.cur') 2 40, pointer; !important }\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
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
      out.write("<!-- <link rel=\"stylesheet\" href=\"./style.css\" /> -->\r\n");
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
      out.write("								");
 if(loginUser != null && loginUser.getUserNickName().equals("관리자")) { 
      out.write("\r\n");
      out.write("									<li><a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">관리자 페이지</a></li>\r\n");
      out.write("								");
 } else { 
      out.write("\r\n");
      out.write("									<li><a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">마이 페이지</a></li>\r\n");
      out.write("								");
 } 
      out.write("\r\n");
      out.write("								");
 if(loginUser != null && loginUser.getUserNickName().equals("관리자")) { 
      out.write("\r\n");
      out.write("								");
 } else { 
      out.write("\r\n");
      out.write("									<li><a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/faq.qna\">FAQ</a></li>\r\n");
      out.write("								");
 } 
      out.write("\r\n");
      out.write("								<li><a class=\"dropdown-item\" onclick=\"window.open('");
      out.print(contextPath);
      out.write("/views/menu/menuChat.jsp', 'chatWindow', 'width=500, height=500')\">채팅방</a></li>\r\n");
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
      out.write("\r\n");
      out.write("	<form id=\"checkPwd\" action=\"");
      out.print( contextPath );
      out.write("/checkPwd.me\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("        <br><br><br><br><br><br><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <h1 class=\"h1\">비밀번호 확인</h1>\r\n");
      out.write("        \r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <h4 class=\"h4\">현재 비밀번호를 입력해주세요.</h4>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"div1\">\r\n");
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"password\" name=\"userPwd\" class=\"input\" maxlength=\"15\" required></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><button type=\"submit\" class=\"button\">다음</button></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("    <html lang=\"english\">\r\n");
      out.write("      <head>\r\n");
      out.write("        <title>Daknawa</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"resources/admin/image/x-icon\" href=\"resources/css/public/playground_assets/logo.png\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta property=\"twitter:card\" content=\"summary_large_image\" />\r\n");
      out.write("    \r\n");
      out.write("        <style data-tag=\"reset-style-sheet\">\r\n");
      out.write("          html {  line-height: 1.15;}body {  margin: 0;}* {  box-sizing: border-box;  border-width: 0;  border-style: solid;}p,li,ul,pre,div,h1,h2,h3,h4,h5,h6,figure,blockquote,figcaption {  margin: 0;  padding: 0;}button {  background-color: transparent;}button,input,optgroup,select,textarea {  font-family: inherit;  font-size: 100%;  line-height: 1.15;  margin: 0;}button,select {  text-transform: none;}button,[type=\"button\"],[type=\"reset\"],[type=\"submit\"] {  -webkit-appearance: button;}button::-moz-focus-inner,[type=\"button\"]::-moz-focus-inner,[type=\"reset\"]::-moz-focus-inner,[type=\"submit\"]::-moz-focus-inner {  border-style: none;  padding: 0;}button:-moz-focus,[type=\"button\"]:-moz-focus,[type=\"reset\"]:-moz-focus,[type=\"submit\"]:-moz-focus {  outline: 1px dotted ButtonText;}a {  color: inherit;  text-decoration: inherit;}input {  padding: 2px 4px;}img {  display: block;}html { scroll-behavior: smooth  }\r\n");
      out.write("        </style>\r\n");
      out.write("         <style> \r\n");
      out.write("    html :hover, body :hover, div :hover, select, input, button:hover, a , button { cursor: url('resources/css/public/playground_assets/cursor.cur') 0 10, auto; !important }\r\n");
      out.write("    html :hover, body :hover, div :hover, select, input, button:hover, a , button { cursor: url('resources/css/public/playground_assets/cursor.cur') 0 10, pointer; !important }\r\n");
      out.write("\r\n");
      out.write("	html:active, body:active, div:active , select:active, input:active { cursor: url('resources/css/public/playground_assets/cursor2.cur') 2 40, auto; !important }\r\n");
      out.write("	html:active, body:active, div:active , select:active, input:active { cursor: url('resources/css/public/playground_assets/cursor2.cur') 2 40, pointer; !important }\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("        <style data-tag=\"default-style-sheet\">\r\n");
      out.write("          html {\r\n");
      out.write("            font-family: Inter;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("          }\r\n");
      out.write("    \r\n");
      out.write("          body {\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            font-style:normal;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            letter-spacing: normal;\r\n");
      out.write("            line-height: 1.15;\r\n");
      out.write("            color: var(--dl-color-gray-black);\r\n");
      out.write("            background-color: var(--dl-color-gray-white);\r\n");
      out.write("    \r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          .footer7-logo1 { width : 30px; }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <link\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("          href=\"https://fonts.googleapis.com/css2?family=Inter:wght@100;200;300;400;500;600;700;800;900&amp;display=swap\"\r\n");
      out.write("          data-tag=\"font\"\r\n");
      out.write("        />\r\n");
      out.write("        <link\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("          href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&amp;display=swap\"\r\n");
      out.write("          data-tag=\"font\"\r\n");
      out.write("        />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./style.css\" />\r\n");
      out.write("      </head>\r\n");
      out.write("      <body>\r\n");
      out.write("        <div style=\"height : 0px; margin-top: 80px;\">\r\n");
      out.write("          <link href=\"resources/css/footer7.css\" rel=\"stylesheet\" />\r\n");
      out.write("          <img\r\n");
      out.write("            src=\"resources/css/public/playground_assets/logo.png\"\r\n");
      out.write("            style=\"margin : auto; width : 75px; height : ; margin-top : 80px; margin-bottom : 20px;\" \r\n");
      out.write("            onclick=\"window.open('https://namu.wiki/w/%EC%B9%98%ED%82%A8', '_blank')\"\r\n");
      out.write("          >\r\n");
      out.write("          <div class=\"footer7-container\" style=\"height : ; min-height: 0vh;\">\r\n");
      out.write("            <div class=\"footer7-footer7\" style=\"padding-top : 0px;\">\r\n");
      out.write("              <div class=\"footer7-content\" style=\"margin-bottom : 0px; height : ;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"footer7-links\">\r\n");
      out.write("                  <span class=\"footer7-text TextRegularSemiBold\">\r\n");
      out.write("                    <span class>\r\n");
      out.write("                     <img\r\n");
      out.write("                    src=\"resources/css/public/playground_assets/bbq.png\"\r\n");
      out.write("                    alt=\"logoI146\"\r\n");
      out.write("                    class=\"footer7-logo1\"\r\n");
      out.write("                    style=\"height : 65px; width : 75px; \"\r\n");
      out.write("                    onclick=\"window.open('https://m.bbq.co.kr/main.asp', '_blank')\"\r\n");
      out.write("                  	/>\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </span>\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"footer7-text02 TextRegularSemiBold\">\r\n");
      out.write("                    <span>\r\n");
      out.write("                     <img\r\n");
      out.write("                    src=\"resources/css/public/playground_assets/bhc.png\"\r\n");
      out.write("                    alt=\"logoI146\"\r\n");
      out.write("                    class=\"footer7-logo1\"\r\n");
      out.write("                    style=\"height : 65px; width : 75px; \"\r\n");
      out.write("                    onclick=\"window.open('https://www.bhc.co.kr/', '_blank')\"\r\n");
      out.write("                  />\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </span>\r\n");
      out.write("                  <span class=\"footer7-text04 TextRegularSemiBold\">\r\n");
      out.write("                    <span>\r\n");
      out.write("                     <img\r\n");
      out.write("                    src=\"resources/css/public/playground_assets/goobne.png\"\r\n");
      out.write("                    alt=\"logoI146\"\r\n");
      out.write("                    class=\"footer7-logo1\"\r\n");
      out.write("                    style=\"height : 65px; width : 72px; \"\r\n");
      out.write("                    onclick=\"window.open('https://www.goobne.co.kr/', '_blank')\"\r\n");
      out.write("                  />\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </span>\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"footer7-text06 TextRegularSemiBold\">\r\n");
      out.write("                    <span>\r\n");
      out.write("                     <img\r\n");
      out.write("                    src=\"resources/css/public/playground_assets/hosigi.png\"\r\n");
      out.write("                    alt=\"logoI146\"\r\n");
      out.write("                    class=\"footer7-logo1\"\r\n");
      out.write("                    style=\"height : 65px; width : 75px;\"\r\n");
      out.write("                    onclick=\"window.open('http://www.9922.co.kr/', '_blank')\"\r\n");
      out.write("\r\n");
      out.write("                  />\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </span>\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"footer7-text08 TextRegularSemiBold\">\r\n");
      out.write("                    <span>\r\n");
      out.write("                     <img\r\n");
      out.write("                    src=\"resources/css/public/playground_assets/dore.png\"\r\n");
      out.write("                    alt=\"logoI146\"\r\n");
      out.write("                    class=\"footer7-logo1\"\r\n");
      out.write("                    style=\"height : 65px; width : 75px; \"\r\n");
      out.write("                    onclick=\"window.open('http://10966.mbym.co.kr/', '_blank')\"\r\n");
      out.write("\r\n");
      out.write("                  />\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"footer7-credits\" style=\"margin-top : 30px;\">\r\n");
      out.write("                <img\r\n");
      out.write("                  src=\"resources/css/public/playground_assets/divideri146-w1db-200h.png\"\r\n");
      out.write("                  alt=\"DividerI146\"\r\n");
      out.write("                  class=\"footer7-divider\"\r\n");
      out.write("                />\r\n");
      out.write("                <div class=\"footer7-row\">\r\n");
      out.write("                  <span class=\"footer7-text10 TextSmallNormal\"></span>\r\n");
      out.write("                    <span>\r\n");
      out.write("                      상호명 : (주)Daknawa | 대표명 : 정태혁 | 사업자등록번호 : 394-96-294852 | 문의 : localhost8889/Daknawa <br>\r\n");
      out.write("                      통신판매업신고번호 :  제 2023-서울영등포-04256호 | 주소 :  서울 영등포구 선유동 2로 57 이레빌딩 19F, 20F <br>\r\n");
      out.write("                      ⓒ 2023 (주)Daknawa, Inc. All rights reserved.\r\n");
      out.write("                  </span>\r\n");
      out.write("                  <div class=\"footer7-footer-links\">\r\n");
      out.write("                    <span class=\"footer7-text14 TextSmallLink\">\r\n");
      out.write("                      <span></span>\r\n");
      out.write("                      </span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </body>\r\n");
      out.write("    \r\n");
      out.write("    </html>\r\n");
      out.write("    ");
      out.write("\r\n");
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
