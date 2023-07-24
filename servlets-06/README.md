# RequestDispatcher

- We can get RequestDispatcher object by below objects
 1. ServletRequest
 2. ServletContext

```java
RequestDispatcher rd=null;
if(null!=uname && !uname.isEmpty() && uname.equalsIgnoreCase("tech2java")) {
	//it allows absolute path(/home) also relative path(home)
	rd=req.getRequestDispatcher("home");
	rd.forward(req, resp);
}else {
	//it allows only absolute url
	rd=getServletContext().getRequestDispatcher("/error");
	rd.forward(req, resp);
}
```