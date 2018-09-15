# 题目 ：583.两个字符串的删除操作 给定两个单词 word1 和 word2，找到使得 word1 和 word2 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。



### 求最大公共子序列，com[i][j]的意思是word1.substring（0，i）和word2.substring(0,j)的最大公共子序列长度，要注意的是空字符串。
```
if(word1.equals("") && !word2.equals("")) {
		return w2+1;//实在太坑爹了！！！
	}
if(word2.equals("") && !word1.equals(""){
	return w1+1;//实在太坑爹了！！！
	}
```
### 暴力判断大法好，，，（这里提交的代码都是本地编写的代码，和实际在letcode上的略有出入 O(∩_∩)O哈哈~）
