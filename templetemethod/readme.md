模板方法模式：
在模板方法模式中，一个抽象类公开定义了执行它的方法的方式/模板。
它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。

意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
何时使用：有一些通用的方法。
如何解决：将这些通用算法抽象出来。

优点： 

    1. 封装不变部分，扩展可变部分。
    2. 提取公共代码，便于维护。 
    3. 行为由父类控制，子类实现。

缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。

使用场景： 

    1.有多个子类共有的方法，且逻辑相同。     
    2.重要的、复杂的方法，可以考虑作为模板方法。

注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。

模板方法模式就是在模板方法中按照一个的规则和顺序调用基本方法，
具体到我们上面那个例子就是 run 方法按照规定的顺序(先调用 start,然后再调用 engineBoom，再调用
alarm，最后调用 stop)调用本类的其他方法，并且由 isAlarm 方法的返回值确定 run 中的执行顺序变更。
