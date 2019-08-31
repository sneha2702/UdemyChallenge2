/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

import java.util.Arrays;



/**
 *
 * @author Arun Reddy
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arrOrg={10,21,5,0,27,2,0,0,1,0,66};
         System.out.println(Arrays.toString(arrOrg));
        // ************* Insert an element into an array**********8//
         int pos=2;
         int value=14;
         int size=(arrOrg.length);
        
       try
       {
            size++;
           for(int i=size-1;i>pos;i--)
         {
             arrOrg[i]=arrOrg[i-1];
         }
       }
       catch(Exception e)
               {
                   
               }
         arrOrg[pos]=value;
        System.out.println(Arrays.toString(arrOrg));
        
        
        
        //**************************Delete an element from the array*******//
        
       int delPos=2;
       int[] arrAfterDel=new int[size-2];
       try
       {
       for(int i=0,k=0;i<=size-1;i++)
       {
           if(i==delPos)
           {
              
               continue;
           }
           
               arrAfterDel[k++]=arrOrg[i];
           
       }
       }
       catch(Exception e)
       {
           
       }
       System.out.println("delete"+Arrays.toString(arrAfterDel));
    
       
       //**************reverse an array***********************//
       
       
       int[] arrRev=new int[size-1];
        System.out.println(size);
       try
       {
            int p=size-1;
            for(int i=0;i<size;i++)
       {
          // System.out.println(arrOrg[i]);
           arrRev[p-1]=arrOrg[i];
           //System.out.println(arrOrg[i]);
           p--;
       }
       }
       catch(Exception e)
       {
           
       }
       System.out.println("reverse"+Arrays.toString(arrRev));
        System.out.println("original"+Arrays.toString(arrOrg));
       
       //************Move all 0's to end of the array************//
     
       int count=0;
       try
       {
       for(int i=0;i<=size;i++)
       {
           if(arrOrg[i]!=0)
           {
               count++;
             
               //arrOrg[i]=arrOrg[i];
               //i++;
           }
           else
           {
               int temp=arrOrg[i];
                arrOrg[i]=arrOrg[count+1];
                arrOrg[count+1]=arrOrg[i];
              // int temp=arrOrg[i];
               //arrOrg[i]=arrOrg[i+1];
              //arrOrg[i+1]=temp;
           }
       }
       }
       catch(Exception e)
       {
           
       }
       System.out.println(Arrays.toString(arrOrg));
    }
    
}
