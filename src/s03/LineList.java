package s03;

import java.util.Arrays;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/3 16:47
 * @Description 顺序表。
 *
 * 注意：
 * 1. 两个部分组成，一个是元素数据，一个大小。
 *
 */
public class LineList {

    int[] data;
    int lengh;

    public LineList() {
    }

    public LineList(int[] data, int lengh) {
        this.data = data;
        this.lengh = lengh;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getLengh() {
        return lengh;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public boolean insert(int i, int x) {

        int j;

        if (lengh >= data.length) {
            System.out.println("The table is overflow.");
            return false;
        }

        if (i<0 || i > lengh) {
            System.out.println("The position is mistake." + i);
            return false;
        }

        for (j=lengh-1; j>= i; j--) {
            data[j+1] = data[j];
            data[i] = x;
            lengh++;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LineList{" +
                "data=" + Arrays.toString(data) +
                ", lengh=" + lengh +
                '}';
    }
}
