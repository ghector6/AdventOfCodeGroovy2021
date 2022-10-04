List numList = [199, 200, 208, 210, 200, 207, 240, 269, 260, 263]  
List flagList = []
List sumList = []
def range = (0..2)
int sum 

/*while(numList.size() !=  2){
	numList = numList[1..-1]
	println numList
	}*/
flagList = numList.collate(3,1)

flagList.eachWithIndex{ it, index ->
	println "The value of this block is $it and the index is $index"
	for(num in index){
		sum = it.sum()
		println sum
	}
}


