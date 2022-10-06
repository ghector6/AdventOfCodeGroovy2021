def inputday2 = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day2-1/inputday2.txt").text
int depth = 0
int length = 0

inputday2.eachLine{ word -> 
	if(word.getAt(0) == "d"){
		word.getAt(-1).each{num -> int lastDig = Integer.parseInt(num)
			depth += lastDig
		}
	}
	if(word.getAt(0) == "u"){
		word.getAt(-1).each{num -> int lastDig = Integer.parseInt(num)
			depth -= lastDig
		}
	} 
	if(word.getAt(0) == "f"){
		word.getAt(-1).each{num -> int lastDig = Integer.parseInt(num)
			length += lastDig
		}		
	}
}

 println "The depth is : $depth and you move forward : $length meters"
 println "You move for a total of " + depth * length