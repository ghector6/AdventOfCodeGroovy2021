import java.io.File
def numList = []
new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day1-1/inputday1-1.txt").eachLine{line -> 
	int parsedn = Integer.parseInt(line)
	numList << parsedn
	}  	
List flagList = []
List sumList = []
def count = 0
def flagnum = 595
int sum 

/*while(numList.size() !=  2){
	numList = numList[1..-1]
	println numList
	}*/
flagList = numList.collate(3,1)

flagList.eachWithIndex{ it, index ->
	
	for(num in index){
		if(it.size() >= 3){
			sum = it.sum()
		sumList << sum
		//println "The value of this block is $it and the index is $index"
		}
		
	}
}

//println sumList
for(i in sumList){
	if(i > flagnum){
		count ++
		
		//println flagnum

	}
	flagnum = i
	
}
//println sumList
println count 

