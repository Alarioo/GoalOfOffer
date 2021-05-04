package l04;
/*
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution04 {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if(matrix.length==0||matrix[0].length==0) return false;
            int N = matrix.length;
            int M = matrix[0].length;
            int p = 0;
            while (p < N ) {
                int p2 = (M - 1) / 2;
                int max = M - 1;
                int min = 0;
                if (target > matrix[p][M - 1]) {
                    p=p+1;
                    continue;
                } else {
                    while (min<=max) {
                        if (target < matrix[p][p2]) {
                            max = p2-1;
                            p2 = min + (max - min) / 2;
                        } else if (target > matrix[p][p2]) {
                            min = p2+1;
                            p2 = min + (max - min) / 2;
                        } else if (target == matrix[p][p2]) {
                            return true;
                        }
                    }
                    p = p + 1;
                }
            }
            return false;
        }
    }

