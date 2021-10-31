import java.util.*;
import java.io.*;

public class StarAlphabetPatterns {
    public static void starPatternA(int n){
    	int height=n;
    	int width=2*n;
    	for(int i=0;i<height;i++){
    		for(int j=0;j<width;j++){
    		    if(i==0){
                   if(j==n) {
    		    	System.out.print("*");
                   }else {
                	   System.out.print(" ");
                   }
    		    }else{
    		    	if(j==(n-i-1) || j==n+i){
        				System.out.print("*");
        			}else if(i==n/2 && j>(i-1) && j<=(n+i)){
        				System.out.print("*");
        			}else{
        				System.out.print(" ");
        			}
    		    	
    		    }
    			
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
    public static void starPatternB(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			 if(j==0 || (i==0 && j<n-1) || (i==n-1 && j<n-1) || (i==n/2 && j<n-1)){
    				System.out.print("*");
    			}else if((i!=0 && i!=(n-1) && j==n-1 && i!=(n/2))){
    				System.out.print("*");
    			}else{
    			    System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
    public static void starPatternC(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if((i==0 && j==0) || (i==n-1 && j==0)){
    				System.out.print(" ");
    			}else if(i==0 || j==0 || i==n-1){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternD(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			
    			if((i==0 && j==n-1) || (i==n-1 && j==n-1)){
    				System.out.print(" ");
    			}else if(i==0 || j==0 || i==n-1 || j==n-1){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternE(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==0 || (i==n/2 && j<n-4) || i==n-1 || j==0){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternF(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==0 || (i==n/2 && j<n-4) || j==0){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternG(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if((j==0 && i!=0 && i!=n-1) || (i==0 && j>0 && j<n) || (i==n-1 && j>0 && j<n) || (j==n-1 && i>=n/2) || (i==n/2 && j>=n/2) ){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternH(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(j==0 || j==n-1 || i==n/2 ){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternI(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==0 || i==n-1 || j==n/2){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternJ(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==0 || (i>=n/2 && j==0 && i!=n-1) || (i==n-1 && j<n/2 && j!=0) || (j==n/2 && i<n-1)){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
  
    }
    
    public static void  starPatternK(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(j==0 || (i<=n/2 && j==n/2-i) || (i>=n/2 && j==i-n/2+1) ){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }	
    
    public static void  starPatternL(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(j==0 || i==n-1){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }	
     
    public static void starPatternM(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(j==0 || j==n-1 || (j<n/2 && i==j) || (j>n/2 && i==n-j-1) ){
    				System.out.print("*");
    			}else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public static void starPatternN(int n) 
    {
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(j==0 || j==n-1 || i==j){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public static void starPatternO(int n)
    {
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if( ((j==n/4-i || j==( (3*n)/4 + i)) && i<=n/4) || ((i==0 || i==n-1) && j>=n/4 && j<=(3*n/4)) || (i>n/4 && i<=(3*n)/4 && (j==0 || j==n-1)) || (i>= (3*n)/4 && (j==i-(3*n)/4 || j==n-i+((3*n)/4))) ){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternP(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if( j==0 || (i<n/2 && j==n-1 && i!=0) || (i==0 && j!=0 && j!=n-1) || (i==n/2 && j!=n-1) ){
    				System.out.print("*");
    			}else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternQ(int n)
    {
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if( ((j==n/4-i || j==( (3*n)/4 + i)) && i<=n/4) || ((i==0 || i==n-1) && j>=n/4 && j<=(3*n/4)) || (i>n/4 && i<=(3*n)/4 && (j==0 || j==n-1)) || (i>= (3*n)/4 && (j==i-(3*n)/4 || j==n-i+((3*n)/4))) ){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    	for(int i=0;i<n-2;i++){
    		for(int j=0;j<2*n;j++){
    			if(j<n-2){
    				System.out.print(" ");
    			}else{
    				if(j==n+i-2){
    					System.out.print("*");
    					break;
    				}else {
    					System.out.print(" ");
    				}
    			}
    			
    		}
    		System.out.println();
    	}
    	
    }
    public static void starPatternR(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if( j==0 || (i<n/2 && j==n-1 && i!=0) || (i==0 && j!=0 && j!=n-1) || (i==n/2 && j!=n-1) || (i>n/2 && j==n-1) ){
    				System.out.print("*");
    			}else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternS(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==0  || i==n-1 || i==n/2 || (i<n/2 && j==0) || (i>n/2 && j==n-1) ){
    				System.out.print("*");
    			}else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public static void starPatternT(int n){
    	
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==0 || j==n/2){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternU(int n) {
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if( (j==0 && i!=n-1) || (i!=n-1 && j==n-1) || (i==n-1 && j!=0 && j!=n-1)){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternV(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<2*n;j++){
    			if(( j<=n && j==i) || (j>n && j==2*n-i-1 ) ){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternW(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(j==0 || j==n-1 || (i>=n/2 && ( j==n-i-1  || j== n/2+ (i-n/2)))){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternX(int n){
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==j || j==n-i-1){
    				System.out.print("*");
    			}else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void starPatternY(int n){
    	
    	if(n%2==0){
    		n++;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if( (i>n/2 && j==n/2)  || (i<n/2 && i==j) || (i<=n/2 && j==n-i-1)){
    				System.out.print("*");
    			}
    			else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public static void starPatternZ(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i==0 || i==n-1 || j==n-i-1){
    				System.out.print("*");
    			}
    			else{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
   
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      starPatternA(n);
      System.out.println();
      System.out.println();

      starPatternB(n);
      System.out.println();
      System.out.println();

      starPatternC(n);
      System.out.println();
      System.out.println();

      starPatternD(n);
      System.out.println();
      System.out.println();

      starPatternE(n);
      System.out.println();
      System.out.println();

      starPatternF(n);
      System.out.println();
      System.out.println();

      System.out.println();
      starPatternG(n);
      System.out.println();
      System.out.println();
      starPatternH(n);
      System.out.println();
      System.out.println();
      starPatternI(n);
      System.out.println();
      System.out.println();
      starPatternJ(n);
      System.out.println();
      System.out.println();
      starPatternK(n);
      System.out.println();
      System.out.println();
      starPatternL(n);
      System.out.println();
      System.out.println();
      starPatternM(n);
      System.out.println();
      System.out.println();
      starPatternN(n); 
      System.out.println();
      System.out.println();
      starPatternO(n); 
      System.out.println();
      System.out.println();
      starPatternP(n); 
      System.out.println();
      System.out.println();
      starPatternQ(n);
      System.out.println();
      System.out.println();
      starPatternR(n); 
      System.out.println();
      System.out.println();
      starPatternS(n);
      System.out.println();
      System.out.println();
      starPatternT(n);
      System.out.println();
      System.out.println();
      starPatternU(n);
      System.out.println();
      System.out.println();
      starPatternV(n);
      System.out.println();
      System.out.println();
      starPatternW(n);
      System.out.println();
      System.out.println();
      starPatternX(n);
      System.out.println();
      System.out.println();
      starPatternY(n);
      System.out.println();
      System.out.println();
      starPatternZ(n);
     
	}

}
