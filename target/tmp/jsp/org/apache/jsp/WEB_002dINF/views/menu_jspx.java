package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item.tagx");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div version=\"2.0\" id=\"menu\">");
      if (_jspx_meth_menu_menu_0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_menu_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu
    org.apache.jsp.tag.web.menu.menu_tagx _jspx_th_menu_menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.menu_tagx.class) : new org.apache.jsp.tag.web.menu.menu_tagx();
    _jspx_th_menu_menu_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_menu_0.setZ("nZaf43BjUg1iM0v70HJVEsXDopc=");
    _jspx_th_menu_menu_0.setId("_menu");
    _jspx_th_menu_menu_0.setJspBody(new menu_jspxHelper( 0, _jspx_page_context, _jspx_th_menu_menu_0, null));
    _jspx_th_menu_menu_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_0.setParent(_jspx_parent);
    _jspx_th_menu_category_0.setZ("QOKmLQs8mRLEvu7n5roIvJzPgHc=");
    _jspx_th_menu_category_0.setId("c_reservation");
    _jspx_th_menu_category_0.setJspBody(new menu_jspxHelper( 1, _jspx_page_context, _jspx_th_menu_category_0, null));
    _jspx_th_menu_category_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_0.setParent(_jspx_parent);
    _jspx_th_menu_item_0.setZ("VN+vNiuOsWM9mc3+Pnfd51o3YUc=");
    _jspx_th_menu_item_0.setUrl("/reservations?form");
    _jspx_th_menu_item_0.setMessageCode("global_menu_new");
    _jspx_th_menu_item_0.setId("i_reservation_new");
    _jspx_th_menu_item_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_1.setParent(_jspx_parent);
    _jspx_th_menu_item_1.setZ("6zE/15aHij6RKEydLc48wX5Bg80=");
    _jspx_th_menu_item_1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/reservations?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_1.setMessageCode("global_menu_list");
    _jspx_th_menu_item_1.setId("i_reservation_list");
    _jspx_th_menu_item_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_1.setParent(_jspx_parent);
    _jspx_th_menu_category_1.setZ("NNs5NTX9rGzch+jZbgH12/g3MNU=");
    _jspx_th_menu_category_1.setId("c_durablearticles");
    _jspx_th_menu_category_1.setJspBody(new menu_jspxHelper( 2, _jspx_page_context, _jspx_th_menu_category_1, null));
    _jspx_th_menu_category_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_2.setParent(_jspx_parent);
    _jspx_th_menu_item_2.setZ("jLshUdGYyzUn5/zYhvvkGxU2tEg=");
    _jspx_th_menu_item_2.setUrl("/durablearticleses?form");
    _jspx_th_menu_item_2.setMessageCode("global_menu_new");
    _jspx_th_menu_item_2.setId("i_durablearticles_new");
    _jspx_th_menu_item_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_3.setParent(_jspx_parent);
    _jspx_th_menu_item_3.setZ("OnxgMU963qGnh6GtVaVp63Wdj+s=");
    _jspx_th_menu_item_3.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/durablearticleses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_3.setMessageCode("global_menu_list");
    _jspx_th_menu_item_3.setId("i_durablearticles_list");
    _jspx_th_menu_item_3.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_2.setParent(_jspx_parent);
    _jspx_th_menu_category_2.setZ("e3e6qTdks0EVUaGbVSSNbM0HcXc=");
    _jspx_th_menu_category_2.setId("c_room");
    _jspx_th_menu_category_2.setJspBody(new menu_jspxHelper( 3, _jspx_page_context, _jspx_th_menu_category_2, null));
    _jspx_th_menu_category_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_4.setParent(_jspx_parent);
    _jspx_th_menu_item_4.setZ("fvAkKg908k/4/1ftKfhIuAeNmjE=");
    _jspx_th_menu_item_4.setUrl("/rooms?form");
    _jspx_th_menu_item_4.setMessageCode("global_menu_new");
    _jspx_th_menu_item_4.setId("i_room_new");
    _jspx_th_menu_item_4.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_5.setParent(_jspx_parent);
    _jspx_th_menu_item_5.setZ("M5XFOS8myAtDzhNTcTwqAph0QtQ=");
    _jspx_th_menu_item_5.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/rooms?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_5.setMessageCode("global_menu_list");
    _jspx_th_menu_item_5.setId("i_room_list");
    _jspx_th_menu_item_5.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_6.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_6.setParent(_jspx_parent);
    _jspx_th_menu_item_6.setZ("iT+/rtHP5GwL9s/70MH3GYUc0Nc=");
    _jspx_th_menu_item_6.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/rooms?find=ByStatus&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_6.setMessageCode("global_menu_find");
    _jspx_th_menu_item_6.setId("fi_room_status");
    _jspx_th_menu_item_6.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_3.setParent(_jspx_parent);
    _jspx_th_menu_category_3.setZ("Wa+bVSiDyYo/wX1nGU1B/z+OKhE=");
    _jspx_th_menu_category_3.setId("c_customer");
    _jspx_th_menu_category_3.setJspBody(new menu_jspxHelper( 4, _jspx_page_context, _jspx_th_menu_category_3, null));
    _jspx_th_menu_category_3.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_7.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_7.setParent(_jspx_parent);
    _jspx_th_menu_item_7.setZ("d9+YIotZHp6KZLGKwwnMVzPvh8k=");
    _jspx_th_menu_item_7.setUrl("/customers?form");
    _jspx_th_menu_item_7.setMessageCode("global_menu_new");
    _jspx_th_menu_item_7.setId("i_customer_new");
    _jspx_th_menu_item_7.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_8.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_8.setParent(_jspx_parent);
    _jspx_th_menu_item_8.setZ("Yo9cUtyc7EUvbxwQ7EoeqXWaVJM=");
    _jspx_th_menu_item_8.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/customers?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_8.setMessageCode("global_menu_list");
    _jspx_th_menu_item_8.setId("i_customer_list");
    _jspx_th_menu_item_8.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_4.setParent(_jspx_parent);
    _jspx_th_menu_category_4.setZ("Y/+UDmgtAjw+Ac2Rp2rDwAjkE78=");
    _jspx_th_menu_category_4.setId("c_roomtype");
    _jspx_th_menu_category_4.setJspBody(new menu_jspxHelper( 5, _jspx_page_context, _jspx_th_menu_category_4, null));
    _jspx_th_menu_category_4.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_9.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_9.setParent(_jspx_parent);
    _jspx_th_menu_item_9.setZ("4qtE0IN/50xkY2NoUmhONG3LthU=");
    _jspx_th_menu_item_9.setUrl("/roomtypes?form");
    _jspx_th_menu_item_9.setMessageCode("global_menu_new");
    _jspx_th_menu_item_9.setId("i_roomtype_new");
    _jspx_th_menu_item_9.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_10.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_10.setParent(_jspx_parent);
    _jspx_th_menu_item_10.setZ("I0scyAa1pmjxbJm6+JNKvoSDzw8=");
    _jspx_th_menu_item_10.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/roomtypes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_10.setMessageCode("global_menu_list");
    _jspx_th_menu_item_10.setId("i_roomtype_list");
    _jspx_th_menu_item_10.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_5.setParent(_jspx_parent);
    _jspx_th_menu_category_5.setZ("Ig8hAD987e6bLqLCmLRqmvSi0KU=");
    _jspx_th_menu_category_5.setId("c_maintenance");
    _jspx_th_menu_category_5.setJspBody(new menu_jspxHelper( 6, _jspx_page_context, _jspx_th_menu_category_5, null));
    _jspx_th_menu_category_5.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_11.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_11.setParent(_jspx_parent);
    _jspx_th_menu_item_11.setZ("1zaIa9O5BMeLpNt9HBlPW84hNGU=");
    _jspx_th_menu_item_11.setUrl("/maintenances?form");
    _jspx_th_menu_item_11.setMessageCode("global_menu_new");
    _jspx_th_menu_item_11.setId("i_maintenance_new");
    _jspx_th_menu_item_11.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_12.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_12.setParent(_jspx_parent);
    _jspx_th_menu_item_12.setZ("K1HheDDt3cM5tIwRlGhuVVpLmBk=");
    _jspx_th_menu_item_12.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/maintenances?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_12.setMessageCode("global_menu_list");
    _jspx_th_menu_item_12.setId("i_maintenance_list");
    _jspx_th_menu_item_12.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_13.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_13.setParent(_jspx_parent);
    _jspx_th_menu_item_13.setZ("j7/j9NLoWkYC46b7fdcD38hL2Ck=");
    _jspx_th_menu_item_13.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/maintenances?find=ByNameEquals&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_13.setMessageCode("global_menu_find");
    _jspx_th_menu_item_13.setId("fi_maintenance_nameequals");
    _jspx_th_menu_item_13.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_6.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_6.setParent(_jspx_parent);
    _jspx_th_menu_category_6.setZ("4/8Ngz3VS6s4zYwuk+WfS7Kvdz4=");
    _jspx_th_menu_category_6.setId("c_maintenances");
    _jspx_th_menu_category_6.setJspBody(new menu_jspxHelper( 7, _jspx_page_context, _jspx_th_menu_category_6, null));
    _jspx_th_menu_category_6.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_14.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_14.setParent(_jspx_parent);
    _jspx_th_menu_item_14.setZ("bzJas1HQkrMa2wt2es4CRPfanC8=");
    _jspx_th_menu_item_14.setUrl("/maintenanceses?form");
    _jspx_th_menu_item_14.setMessageCode("global_menu_new");
    _jspx_th_menu_item_14.setId("i_maintenances_new");
    _jspx_th_menu_item_14.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_15.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_15.setParent(_jspx_parent);
    _jspx_th_menu_item_15.setZ("oN3KM3B6oqq65LcEu6P6JaOk6IQ=");
    _jspx_th_menu_item_15.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/maintenanceses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_15.setMessageCode("global_menu_list");
    _jspx_th_menu_item_15.setId("i_maintenances_list");
    _jspx_th_menu_item_15.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_7.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_7.setParent(_jspx_parent);
    _jspx_th_menu_category_7.setZ("Wlk+0bPikS3yAr20jgeo6FFUqbQ=");
    _jspx_th_menu_category_7.setId("c_rentdurablearticles");
    _jspx_th_menu_category_7.setJspBody(new menu_jspxHelper( 8, _jspx_page_context, _jspx_th_menu_category_7, null));
    _jspx_th_menu_category_7.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_16.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_16.setParent(_jspx_parent);
    _jspx_th_menu_item_16.setZ("og88LcPSfbQCYIUA6KnDyfijRyE=");
    _jspx_th_menu_item_16.setUrl("/rentdurablearticleses?form");
    _jspx_th_menu_item_16.setMessageCode("global_menu_new");
    _jspx_th_menu_item_16.setId("i_rentdurablearticles_new");
    _jspx_th_menu_item_16.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_17.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_17.setParent(_jspx_parent);
    _jspx_th_menu_item_17.setZ("SZEtHhhhgQQj/zh1vo+CLUZPO1Q=");
    _jspx_th_menu_item_17.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/rentdurablearticleses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_17.setMessageCode("global_menu_list");
    _jspx_th_menu_item_17.setId("i_rentdurablearticles_list");
    _jspx_th_menu_item_17.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_18.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_18.setParent(_jspx_parent);
    _jspx_th_menu_item_18.setZ("FWs5j+HWP5j2ndRteroGrVT03ew=");
    _jspx_th_menu_item_18.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/rentdurablearticleses?find=ByNameEquals&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_18.setMessageCode("global_menu_find");
    _jspx_th_menu_item_18.setId("fi_rentdurablearticles_nameequals");
    _jspx_th_menu_item_18.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_8.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_8.setParent(_jspx_parent);
    _jspx_th_menu_category_8.setZ("KXvP3nk7swdtwqF1yirxi8G+72w=");
    _jspx_th_menu_category_8.setId("c_payment");
    _jspx_th_menu_category_8.setJspBody(new menu_jspxHelper( 9, _jspx_page_context, _jspx_th_menu_category_8, null));
    _jspx_th_menu_category_8.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_19.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_19.setParent(_jspx_parent);
    _jspx_th_menu_item_19.setZ("MsWgEk8mPOMZsZrpSmZ4EEiRzKQ=");
    _jspx_th_menu_item_19.setUrl("/payments?form");
    _jspx_th_menu_item_19.setMessageCode("global_menu_new");
    _jspx_th_menu_item_19.setId("i_payment_new");
    _jspx_th_menu_item_19.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_20.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_20.setParent(_jspx_parent);
    _jspx_th_menu_item_20.setZ("Z3RAJMV3OotiyNAbiUB5cNixuyY=");
    _jspx_th_menu_item_20.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/payments?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_20.setMessageCode("global_menu_list");
    _jspx_th_menu_item_20.setId("i_payment_list");
    _jspx_th_menu_item_20.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_21 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_21.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_21.setParent(_jspx_parent);
    _jspx_th_menu_item_21.setZ("992ge3PXGO6/VYhTun5B4REzAnw=");
    _jspx_th_menu_item_21.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/payments?find=ByName&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_21.setMessageCode("global_menu_find");
    _jspx_th_menu_item_21.setId("fi_payment_name");
    _jspx_th_menu_item_21.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_9.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_9.setParent(_jspx_parent);
    _jspx_th_menu_category_9.setZ("uRlUeyyIZHHSI4JCPMYUcniQr4o=");
    _jspx_th_menu_category_9.setId("c_leaseagreement");
    _jspx_th_menu_category_9.setJspBody(new menu_jspxHelper( 10, _jspx_page_context, _jspx_th_menu_category_9, null));
    _jspx_th_menu_category_9.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_22 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_22.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_22.setParent(_jspx_parent);
    _jspx_th_menu_item_22.setZ("SeGZxTjvYWil4IHYp1p5ma5NUU8=");
    _jspx_th_menu_item_22.setUrl("/leaseagreements?form");
    _jspx_th_menu_item_22.setMessageCode("global_menu_new");
    _jspx_th_menu_item_22.setId("i_leaseagreement_new");
    _jspx_th_menu_item_22.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_23 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_23.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_23.setParent(_jspx_parent);
    _jspx_th_menu_item_23.setZ("6CkE9qQQyL7JCAWOGpy0Q4e7kvs=");
    _jspx_th_menu_item_23.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/leaseagreements?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_23.setMessageCode("global_menu_list");
    _jspx_th_menu_item_23.setId("i_leaseagreement_list");
    _jspx_th_menu_item_23.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_24 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_24.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_24.setParent(_jspx_parent);
    _jspx_th_menu_item_24.setZ("eSJfKVIf+6yRQLxsIBJlKhRM1Z4=");
    _jspx_th_menu_item_24.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/leaseagreements?find=ByRoomnumber&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_24.setMessageCode("global_menu_find");
    _jspx_th_menu_item_24.setId("fi_leaseagreement_roomnumber");
    _jspx_th_menu_item_24.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_10.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_10.setParent(_jspx_parent);
    _jspx_th_menu_category_10.setZ("+yqCePpt/F49ZWiFGkoydgkDQ5M=");
    _jspx_th_menu_category_10.setId("c_type");
    _jspx_th_menu_category_10.setJspBody(new menu_jspxHelper( 11, _jspx_page_context, _jspx_th_menu_category_10, null));
    _jspx_th_menu_category_10.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_25 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_25.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_25.setParent(_jspx_parent);
    _jspx_th_menu_item_25.setZ("+j5IPiozzM2i3pdeYlCtbYLl1EI=");
    _jspx_th_menu_item_25.setUrl("/types?form");
    _jspx_th_menu_item_25.setMessageCode("global_menu_new");
    _jspx_th_menu_item_25.setId("i_type_new");
    _jspx_th_menu_item_25.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_26 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_26.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_26.setParent(_jspx_parent);
    _jspx_th_menu_item_26.setZ("41OvG76FSBdkBS6GuWQQ8H3SVQ4=");
    _jspx_th_menu_item_26.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/types?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_26.setMessageCode("global_menu_list");
    _jspx_th_menu_item_26.setId("i_type_list");
    _jspx_th_menu_item_26.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_11.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_11.setParent(_jspx_parent);
    _jspx_th_menu_category_11.setZ("VseHQbIoDR931YBA8W2zFL4RKlQ=");
    _jspx_th_menu_category_11.setId("c_inform");
    _jspx_th_menu_category_11.setJspBody(new menu_jspxHelper( 12, _jspx_page_context, _jspx_th_menu_category_11, null));
    _jspx_th_menu_category_11.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_27 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_27.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_27.setParent(_jspx_parent);
    _jspx_th_menu_item_27.setZ("q0W0GOGvmyXfJU7STKzN4NZiwQI=");
    _jspx_th_menu_item_27.setUrl("/informs?form");
    _jspx_th_menu_item_27.setMessageCode("global_menu_new");
    _jspx_th_menu_item_27.setId("i_inform_new");
    _jspx_th_menu_item_27.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_28 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_28.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_28.setParent(_jspx_parent);
    _jspx_th_menu_item_28.setZ("xs3EPg6N+rsikC16CGqPEmq1P54=");
    _jspx_th_menu_item_28.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/informs?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_28.setMessageCode("global_menu_list");
    _jspx_th_menu_item_28.setId("i_inform_list");
    _jspx_th_menu_item_28.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_29 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_29.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_29.setParent(_jspx_parent);
    _jspx_th_menu_item_29.setZ("Lw+SwAouPAcTdyBdjiz9Rot5UWg=");
    _jspx_th_menu_item_29.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/informs?find=ByTypeAndColor&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_29.setMessageCode("global_menu_find");
    _jspx_th_menu_item_29.setId("fi_inform_typeandcolor");
    _jspx_th_menu_item_29.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_12.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_12.setParent(_jspx_parent);
    _jspx_th_menu_category_12.setZ("0SMMDBBRxlb3qc4UcZUiEPSXY0s=");
    _jspx_th_menu_category_12.setId("c_color");
    _jspx_th_menu_category_12.setJspBody(new menu_jspxHelper( 13, _jspx_page_context, _jspx_th_menu_category_12, null));
    _jspx_th_menu_category_12.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_30 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_30.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_30.setParent(_jspx_parent);
    _jspx_th_menu_item_30.setZ("K66FCEtpkaVsKD0J0KpnyU6fxRU=");
    _jspx_th_menu_item_30.setUrl("/colors?form");
    _jspx_th_menu_item_30.setMessageCode("global_menu_new");
    _jspx_th_menu_item_30.setId("i_color_new");
    _jspx_th_menu_item_30.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_31 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_31.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_31.setParent(_jspx_parent);
    _jspx_th_menu_item_31.setZ("X9IgSqEaG8/kPEaOCbE3HTeXfMU=");
    _jspx_th_menu_item_31.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/colors?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_31.setMessageCode("global_menu_list");
    _jspx_th_menu_item_31.setId("i_color_list");
    _jspx_th_menu_item_31.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_13.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_13.setParent(_jspx_parent);
    _jspx_th_menu_category_13.setZ("Un1XhyqcB6XG99+2rY+jQIpgSL4=");
    _jspx_th_menu_category_13.setId("c_trainer");
    _jspx_th_menu_category_13.setJspBody(new menu_jspxHelper( 14, _jspx_page_context, _jspx_th_menu_category_13, null));
    _jspx_th_menu_category_13.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_32(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_32 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_32.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_32.setParent(_jspx_parent);
    _jspx_th_menu_item_32.setZ("DoOltAdx+MEY2oym0PuWO232YjE=");
    _jspx_th_menu_item_32.setUrl("/trainers?form");
    _jspx_th_menu_item_32.setMessageCode("global_menu_new");
    _jspx_th_menu_item_32.setId("i_trainer_new");
    _jspx_th_menu_item_32.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_33(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_33 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_33.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_33.setParent(_jspx_parent);
    _jspx_th_menu_item_33.setZ("aPBWwu+5u1uM+B5H4YJEZ92Sy7k=");
    _jspx_th_menu_item_33.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/trainers?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_33.setMessageCode("global_menu_list");
    _jspx_th_menu_item_33.setId("i_trainer_list");
    _jspx_th_menu_item_33.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_14.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_14.setParent(_jspx_parent);
    _jspx_th_menu_category_14.setZ("OC30i6Oshx8lAoee4zSxiKePgw0=");
    _jspx_th_menu_category_14.setId("c_fitnesspackages");
    _jspx_th_menu_category_14.setJspBody(new menu_jspxHelper( 15, _jspx_page_context, _jspx_th_menu_category_14, null));
    _jspx_th_menu_category_14.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_34(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_34 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_34.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_34.setParent(_jspx_parent);
    _jspx_th_menu_item_34.setZ("upGlKRlZdQzFvrSm2q0e43YHjIo=");
    _jspx_th_menu_item_34.setUrl("/fitnesspackageses?form");
    _jspx_th_menu_item_34.setMessageCode("global_menu_new");
    _jspx_th_menu_item_34.setId("i_fitnesspackages_new");
    _jspx_th_menu_item_34.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_35(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_35 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_35.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_35.setParent(_jspx_parent);
    _jspx_th_menu_item_35.setZ("Y0sLFF2oiU0lVECm5PtecLUXRnY=");
    _jspx_th_menu_item_35.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/fitnesspackageses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_35.setMessageCode("global_menu_list");
    _jspx_th_menu_item_35.setId("i_fitnesspackages_list");
    _jspx_th_menu_item_35.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_15.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_15.setParent(_jspx_parent);
    _jspx_th_menu_category_15.setZ("XQpI/0h+55Sq+UIeqca7drMX/o0=");
    _jspx_th_menu_category_15.setId("c_packagename");
    _jspx_th_menu_category_15.setJspBody(new menu_jspxHelper( 16, _jspx_page_context, _jspx_th_menu_category_15, null));
    _jspx_th_menu_category_15.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_36(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_36 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_36.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_36.setParent(_jspx_parent);
    _jspx_th_menu_item_36.setZ("MoEQiVINezjFjWfVkcc70AcRRvs=");
    _jspx_th_menu_item_36.setUrl("/packagenames?form");
    _jspx_th_menu_item_36.setMessageCode("global_menu_new");
    _jspx_th_menu_item_36.setId("i_packagename_new");
    _jspx_th_menu_item_36.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_37(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_37 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_37.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_37.setParent(_jspx_parent);
    _jspx_th_menu_item_37.setZ("yTqCU1WLgCXfX6DWQdTbDKTAFjo=");
    _jspx_th_menu_item_37.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/packagenames?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_37.setMessageCode("global_menu_list");
    _jspx_th_menu_item_37.setId("i_packagename_list");
    _jspx_th_menu_item_37.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_16.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_16.setParent(_jspx_parent);
    _jspx_th_menu_category_16.setZ("cp6XMBZVufqR0wMOi+fP/gNx+Ak=");
    _jspx_th_menu_category_16.setId("c_fitnessservice");
    _jspx_th_menu_category_16.setJspBody(new menu_jspxHelper( 17, _jspx_page_context, _jspx_th_menu_category_16, null));
    _jspx_th_menu_category_16.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_38(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_38 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_38.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_38.setParent(_jspx_parent);
    _jspx_th_menu_item_38.setZ("S37d6d3ESzyZio69ksV4Fxhma5c=");
    _jspx_th_menu_item_38.setUrl("/fitnessservices?form");
    _jspx_th_menu_item_38.setMessageCode("global_menu_new");
    _jspx_th_menu_item_38.setId("i_fitnessservice_new");
    _jspx_th_menu_item_38.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_39(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_39 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_39.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_39.setParent(_jspx_parent);
    _jspx_th_menu_item_39.setZ("u8CaJ6BK+hVc1ZfkzYpiwDSkGVk=");
    _jspx_th_menu_item_39.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/fitnessservices?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_39.setMessageCode("global_menu_list");
    _jspx_th_menu_item_39.setId("i_fitnessservice_list");
    _jspx_th_menu_item_39.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_40(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_40 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_40.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_40.setParent(_jspx_parent);
    _jspx_th_menu_item_40.setZ("cu9sdMX2VEoSnbV/csbLqhYUS5M=");
    _jspx_th_menu_item_40.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/fitnessservices?find=ByName&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_40.setMessageCode("global_menu_find");
    _jspx_th_menu_item_40.setId("fi_fitnessservice_name");
    _jspx_th_menu_item_40.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_17.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_17.setParent(_jspx_parent);
    _jspx_th_menu_category_17.setZ("Rvu1zJsA/ZlLPwOc+kktK4Ts8kg=");
    _jspx_th_menu_category_17.setId("c_receiveparcelpost");
    _jspx_th_menu_category_17.setJspBody(new menu_jspxHelper( 18, _jspx_page_context, _jspx_th_menu_category_17, null));
    _jspx_th_menu_category_17.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_41(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_41 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_41.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_41.setParent(_jspx_parent);
    _jspx_th_menu_item_41.setZ("61K8Ye+xDIi1WYiMCeMEX23l2ok=");
    _jspx_th_menu_item_41.setUrl("/receiveparcelposts?form");
    _jspx_th_menu_item_41.setMessageCode("global_menu_new");
    _jspx_th_menu_item_41.setId("i_receiveparcelpost_new");
    _jspx_th_menu_item_41.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_42(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_42 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_42.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_42.setParent(_jspx_parent);
    _jspx_th_menu_item_42.setZ("/RNZ9/rSAaAToiCFAq/B3Oc05fw=");
    _jspx_th_menu_item_42.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/receiveparcelposts?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_42.setMessageCode("global_menu_list");
    _jspx_th_menu_item_42.setId("i_receiveparcelpost_list");
    _jspx_th_menu_item_42.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_43(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_43 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_43.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_43.setParent(_jspx_parent);
    _jspx_th_menu_item_43.setZ("bjgtO5/+ZLdphum3ElgqGuzjOe4=");
    _jspx_th_menu_item_43.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/receiveparcelposts?find=ByTrackEquals&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_43.setMessageCode("global_menu_find");
    _jspx_th_menu_item_43.setId("fi_receiveparcelpost_trackequals");
    _jspx_th_menu_item_43.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_18.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_18.setParent(_jspx_parent);
    _jspx_th_menu_category_18.setZ("ijG7AunIcAS2KhXpuBNdqu/cYME=");
    _jspx_th_menu_category_18.setId("c_fine");
    _jspx_th_menu_category_18.setJspBody(new menu_jspxHelper( 19, _jspx_page_context, _jspx_th_menu_category_18, null));
    _jspx_th_menu_category_18.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_44(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_44 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_44.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_44.setParent(_jspx_parent);
    _jspx_th_menu_item_44.setZ("TYlaWrXTp/44k7SwIrhIFjeUxtg=");
    _jspx_th_menu_item_44.setUrl("/fines?form");
    _jspx_th_menu_item_44.setMessageCode("global_menu_new");
    _jspx_th_menu_item_44.setId("i_fine_new");
    _jspx_th_menu_item_44.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_45(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_45 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_45.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_45.setParent(_jspx_parent);
    _jspx_th_menu_item_45.setZ("amcR1C9LoI6/Ta0Xw5LRJGpCT68=");
    _jspx_th_menu_item_45.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/fines?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_45.setMessageCode("global_menu_list");
    _jspx_th_menu_item_45.setId("i_fine_list");
    _jspx_th_menu_item_45.doTag();
    return false;
  }

  private class menu_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public menu_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_category_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_21((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_27((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_28((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_29((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_30((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_31((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_32((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_33((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_34((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_35((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_36((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_37((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_38((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_39((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_40((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke18( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_41((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_42((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_43((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke19( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_44((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_45((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
          case 4:
            invoke4( out );
            break;
          case 5:
            invoke5( out );
            break;
          case 6:
            invoke6( out );
            break;
          case 7:
            invoke7( out );
            break;
          case 8:
            invoke8( out );
            break;
          case 9:
            invoke9( out );
            break;
          case 10:
            invoke10( out );
            break;
          case 11:
            invoke11( out );
            break;
          case 12:
            invoke12( out );
            break;
          case 13:
            invoke13( out );
            break;
          case 14:
            invoke14( out );
            break;
          case 15:
            invoke15( out );
            break;
          case 16:
            invoke16( out );
            break;
          case 17:
            invoke17( out );
            break;
          case 18:
            invoke18( out );
            break;
          case 19:
            invoke19( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
