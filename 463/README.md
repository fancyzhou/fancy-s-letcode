# 463. 岛屿的周长

 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

---

### 思路就是查一遍他的上下左右，若一侧为0则该侧周长为1，四侧都统计好即可，就是要注意下特殊情况（数组为{{1}}），另外还要注意浅拷贝深拷贝的问题，二维数组直接调用.clone()是不行的哦，具体见[这里](https://blog.csdn.net/qq_37232304/article/details/79950022)
