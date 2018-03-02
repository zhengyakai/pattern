访问者模式:
类图说明:
抽象访问者（Visitor）：抽象类或者接口，声明访问者可以访问哪些元素，具体到程序中就是 visit
方法的参数定义哪些对象是可以被访问的；
具体访问者（ConcreteVisitor）:访问者访问到一个类后该怎么干(哎，这个别读歪了)，要做什么事
情；
抽象元素（Element）：接口或者抽象类，声明接受那一类型的访问者访问，程序上是通过 accept 方法
中的参数来定义；
具体元素：（ConcreteElement）:实现 accept 方法，通常是 visitor.visit(this)，基本上都形成了一
个套路了；
结构对象(ObjectStruture):容纳多个不同类、不同接口的容器，比如 List、Set、Map 等，在项目中，
一般很少抽象出来这个角色；

在这种地方你一定要考虑到使用访问者模式：业务规则要求遍历多个不同的对象。这本身也是访问者模式出发点，
迭代器模式只能访问同类或同接口的数据，（当然了，你使用 instanceof 的话，能访问所有的数据，这个不争论），
而访问者模式是对迭代器模式的扩充，可以遍历不同的对象，然后执行不同的操作，也就是针对访问的对象不同，
执行不同的操作。

访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。