
public class Question2 {public int[] Combine(int[] array1, int[] array2)

{

int[] merge = new char[array1.length + array2.length]; // The merged array will be the first array plus the second

 

                                for (int i = 0, j = 0, k = 0; i < merge.length; i++) 

                                {

                                                int remainder = i % 2;

                                                

                                                if (remainder == 0)

                                                {

                                                                merge[i] = array1[j];

                                                                j++;

                                                }

                                                else if (remainder == 1)

                                                {

                                                                merge[i] = array2[k];

                                                                k++;

                                                }

                                }

                                

                     return merge;

                }


}
