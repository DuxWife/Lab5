package m5;
import java.io.*;
public class M5 {
    public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n,i,j,k=0,m=0;
         double s=0;
         System.out.print("Введите размер матрицы:");
         n=Integer.parseInt(br.readLine ());
         int [][] a=new int [n][n];
          for (i=0;i<n;i++) {
             for (j=0;j<n;j++){
                System.out.print("("+(i+1)+","+(j+1)+")=");
                a[i][j]=Integer.parseInt(br.readLine ());
             }  
          }
         for (i=0;i<n;i++){
             for (j=0;j<n;j++){
                 if (i<j){
                     s=s+a[i][j];
                     m++;
                 }
                 if (i>j){
                     if (a[i][j]%2==0) k++;
                 }
             }
         } 
         System.out.println("Среднее арифметическое элементов над главной диагональю="+s/m);
         System.out.println("Количество четных элементов под главной диагональю="+k);
    }    
}
