#313. 超级丑数

编写一段程序来查找第 n 个超级丑数。
超级丑数是指其所有质因数都是长度为 k 的质数列表 primes 中的正整数。
---

还是dp啦，，，一开始想的是遍历两次找大于dp[i-1]的最小数，赋值给dp[i]，但是果断超时，，，
这种方法就是用idx[]存这些素数“已经使用的次数”，
