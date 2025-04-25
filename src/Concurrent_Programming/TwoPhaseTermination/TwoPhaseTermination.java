package src.Concurrent_Programming.TwoPhaseTermination;

class TwoPhaseTermination {
    /*
    * 这个设计模式是研究如何在一个线程中终止另一个线程, 并且不是强行终止, 而是给被终止线程finalize的机会.
    *
    * 错误思路:
    * 直接使用stop()杀死线程. 或者用System.exit()终止整个程序. stop()在 java 1.2 时被弃用.
    *
    * 正确思路:
    *
    *
    * */
}
