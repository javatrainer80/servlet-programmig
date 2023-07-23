# HttpServletRequest
```
# Retrieve form parameters from request

1. getParameter()
2. getParameterValues()
3. getParameterNames()
4. getParameterMap()

# Retrieve request headers
1. getHeader()
2. getHeaders()
3. getHeaderNames()
4. getIntHeader()
5. getDateHeader()

# Get Cookies
1. getCookies() 
```

# HttpServeletResponse
```
# Setting Headers
1. addHeader()
2. setHeader()
3. addIntHeader()
4. setIntHeader()
5. addDateHeader()
6. setDateHeader()

# Setting content-type
1. setContentType() or setHeader()

# Getting Text Stream

1. PrintWriter out=resp.getWriter()

# Getting Binary Stream
 1. resp.getOutputStream()
 
# Redirecting Request
1. resp.sendRedirect()

# Adding cookie
1. resp.addCookie()
```

# Redirect
- /servlets-05-v1/customer

```
-SaveCustomerServlet send this response back to browser with below information when form submitted
Status Code: 302
Location:/servlets-05-v1/send-result

-Then browser send new request to ResultServlet (here no request sharing )
```


# init & Context params
- Don't override init(ServletConfig) method- if we override getInitParam() will not work.

- getInitParameterNames() for getting init params
- ServletContext context=getServletContext(); for getting context params
