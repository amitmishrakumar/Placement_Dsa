// public class findlargestNun {
//     public static void main(String[] args) {
//         int arr[] = { 7, 4, 5, 1, 3, 2 };
//         int large = Integer.MIN_VALUE;
//         int small = Integer.MAX_VALUE;
//         for (int i : arr) {
//             if (i > large) {
//                 large = i;
//             }
//             if (i < small) {
//                 small = i;
//             }
//         }
//         System.out.println(large);
//         System.out.println(small);
//     }
// }

//Find the second largest element in an array
// public class findlargestNun {
//     public static void main(String[] args) {
//         int arr[] = { 7, 4, 5, 1, 3, 2,8,77,87 };
//         int large = Integer.MIN_VALUE;
//         int sl =0;
//         for (int i : arr) {
//                  sl = t;
//                 large = i;
//             }
//               if (i > large) {               
//                 int t = large;              
//      }
//         System.out.print(sl);

//     }
// }      

//   *****************  Question number 3 in reverse in arrays   ***************


public class findlargestNun {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 5, 1, 3, 2 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
      System.out.println();
       
    }
}