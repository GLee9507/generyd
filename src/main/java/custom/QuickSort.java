package custom;

public class QuickSort {
    //TODO
    public static void sort(int[] array, int start, int end) {

    }


//    int AdjustArray(int s[], int l, int r) //返回调整后基准数的位置
//    {
//        int i = l, j = r;
//        int x = s[l]; //s[l]即s[i]就是第一个坑
//        while (i < j)
//        {
//            // 从右向左找小于x的数来填s[i]
//            while(i < j && s[j] >= x)
//                j--;
//            if(i < j)
//            {
//                s[i] = s[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑
//                i++;
//            }
//
//            // 从左向右找大于或等于x的数来填s[j]
//            while(i < j && s[i] < x)
//                i++;
//            if(i < j)
//            {
//                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
//                j--;
//            }
//        }
//        //退出时，i等于j。将x填到这个坑中。
//        s[i] = x;
//
//        return i;
//    }


//    //快速排序
//    void quick_sort(int s[], int l, int r)
//    {
//        if (l < r)
//        {
//            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
//            int i = l, j = r, x = s[l];
//            while (i < j)
//            {
//                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
//                    j--;
//                if(i < j)
//                    s[i++] = s[j];
//
//                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
//                    i++;
//                if(i < j)
//                    s[j--] = s[i];
//            }
//            s[i] = x;
//            quick_sort(s, l, i - 1); // 递归调用
//            quick_sort(s, i + 1, r);
//        }
//    }
//    快速排序
//————————————————
//    版权声明：本文为CSDN博主「MoreWindows」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/morewindows/java/article/details/6684558

    private static int partition(int[] array, int l, int f) {
        int i = l, j = f;
        int x = array[l];
        while (i < j) {
            while (i < j && array[j] >= x) {
                j--;
            }

            if (i < j) {
                array[i] = array[j];
                i++;
            }

            while (i < j && array[i] < x) {
                i++;
            }

            if (i < j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = x;
        return i;
    }
}
