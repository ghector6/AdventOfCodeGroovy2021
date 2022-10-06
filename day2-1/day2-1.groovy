def inputday2 = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day2-1/inputday2.txt").text
int depth = 0
int length = 0
inputday2.eachLine{ num ->
	int lastDig = Integer.parseInt(num.getAt(-1))
	println lastDig
}

inputday2.eachLine{ word -> 
	if(word.getAt(0) == "d"){
		depth++

	}
	if(word.getAt(0) == "u"){
		depth--
	} 
	if(word.getAt(0) == "f"){
		length++
	}

}
 println "The depth is : $depth and you move forward : $length meters"
