package PerformanceEval;

import java.util.*;

public class Main {
	
	public static void PrintIntData(IntegerData[] data) {
		for(int i = 0; i < data.length; i++) {
			if (i%10 == 0) System.out.println();
			System.out.printf(data[i].get()+"  ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		System.out.println();
	}
	
	public static void PrintStrData(StringData[] data) {
		for(int i = 0; i < data.length; i++) {
			if (i%10 == 0) System.out.println();
			System.out.printf(data[i].get()+"  ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		System.out.println();
	}
	
	public static void PrintTime(String stype, int num, long stime, long ftime) {
		long etime = ftime - stime;

		System.out.println(stype+": 데이터 "+num+"개 성능측정 결과");
		System.out.println("Start   Time(ns) : "+stime);
		System.out.println("Finish  Time(ns) : "+ftime);
		System.out.println("Elapsed Time(ns) : "+etime);
		System.out.println(stype+", "+stime+", "+ftime+", "+etime);
		System.out.println("------------------------------------------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime, finishTime;
		String sortType;

		// 1. 데이터 생성 
		   // 화면에서 생성할 데이터 갯수를 입력 받음
		   Scanner sc = new Scanner(System.in);			
		   System.out.println("생성할 데이터 갯수를 입력 : ");
		   int n = sc.nextInt();
		   
		   genData gd = new genData();
		   IntegerData[] intdata = gd.genIntegerData(n);
		   IntegerData[] idata;
		   
		   StringData[] strdata = gd.genStringData(n);
		   StringData[] sdata;
		   
		   System.out.println("정수형 데이터 - 정렬 이전 : ");
		   PrintIntData(intdata);
		   
		   System.out.println("스트링 데이터 - 정렬 이전 : ");
		   PrintStrData(strdata);
		   
		   
		// 2. 정렬
		   
			// 2.1 Selection Sort() (선택정렬)
		    sortType = "Selection Sort";
		    idata = intdata;				 // 정수형 대이터 정렬
		    startTime = System.nanoTime();   // 참고: milisecond 단위 시간 측정 - System.currentTimeMillis();
			Selection.sort(idata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 (정수형) : ");
			PrintIntData(idata);
			PrintTime(sortType, n, startTime, finishTime);
			
		    sdata = strdata;				// 스트링 대이터 정렬
			startTime = System.nanoTime();   
			Selection.sort(strdata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 (스트링) : ");
			PrintStrData(strdata); 
			PrintTime(sortType, n, startTime, finishTime);
			// 2.2 Insertion Sort() (삽입정렬)
			sortType = "Insertion Sort";
			idata = intdata;				// 정수형 데이터 정렬
			startTime = System.nanoTime();   
			Insertion.sort(idata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 : ");
			PrintIntData(idata);
			PrintTime(sortType, n, startTime, finishTime);
						
			sdata = strdata;				// 스트링 대이터 정렬
			startTime = System.nanoTime();   
			Insertion.sort(strdata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 (스트링) : ");
			PrintStrData(strdata);
			PrintTime(sortType, n, startTime, finishTime);
			
			// 2.3 Shell Sort() (쉘 정렬)
			sortType = "Shell Sort";
			idata = intdata;				// 정수형 데이터 정렬
		    startTime = System.nanoTime();   
			Shell.sort(idata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 : ");
			PrintIntData(idata);
			PrintTime(sortType, n, startTime, finishTime);
			
		    sdata = strdata;				// 스트링 대이터 정렬
			startTime = System.nanoTime();   
			Shell.sort(strdata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 (스트링) : ");
			PrintStrData(strdata);
			PrintTime(sortType, n, startTime, finishTime);
			
			// 2.4 Heap Sort() (힙 정렬)
			sortType = "Heap Sort";
			idata = intdata;				// 정수형 데이터 정렬
		    startTime = System.nanoTime();   
			Heap.sort(idata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 : ");
			PrintIntData(idata);
			PrintTime(sortType, n, startTime, finishTime);
			
		    sdata = strdata;				// 스트링 대이터 정렬
			startTime = System.nanoTime();   
			Heap.sort(strdata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 (스트링) : ");
			PrintStrData(strdata);
			PrintTime(sortType, n, startTime, finishTime);
			
			// 2.5 Merge Sort (합병 정렬)
			sortType = "Merge Sort";
			idata = intdata;				// 정수형 데이터 정렬
		    startTime = System.nanoTime();   
			Merge.sort(idata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 : ");
			PrintIntData(idata);
			PrintTime(sortType, n, startTime, finishTime);
			
		    sdata = strdata;				// 스트링 데이터 정렬
			startTime = System.nanoTime();   
			Merge.sort(strdata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 (스트링) : ");
			PrintStrData(strdata);
			PrintTime(sortType, n, startTime, finishTime);
			
			// 2.6 Quick Sort (퀵 정렬)
			sortType = "Quick Sort";
			idata = intdata;				// 정수형 데이터 정렬
		    startTime = System.nanoTime();   
			Quick.sort(idata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 : ");
			PrintIntData(idata);
			PrintTime(sortType, n, startTime, finishTime);
			
		    sdata = strdata;				// 스트링 데이터 정렬
			startTime = System.nanoTime();   
			Quick.sort(strdata);
			finishTime  = System.nanoTime();
			System.out.println(sortType + " 이후 (스트링) : ");
			PrintStrData(strdata);
			PrintTime(sortType, n, startTime, finishTime);
			
	}		

}
