>  A Simple AspectJ Aspect Oriented Programming Project

---

This has helped me learn about Aspect Oriented Programming and how frameworks
like Spring and AspectJ leverage Java's Reflection and Proxying capabilities to
provide a clean and modular way to separate cross-cutting concerns from the
core business logic.

``` shell
src
├── main
│   ├── java
│   │   └── org
│   │       └── example
│   │           ├── App.java
│   │           ├── logging
│   │           │   └── Logging.java # Logging provided using AspectJ Proxies and AOP
│   │           ├── restapi
│   │           │   └── Api.java # A simple REST Controller
│   │           └── services
│   │               └── UserService.java
```
