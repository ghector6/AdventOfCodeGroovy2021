def inputday2 = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day2-1/inputday2.txt").text
int depth = 0
int length = 0
int aim = 0

inputday2.eachLine{ word -> 
	if(word.getAt(0) == "d"){
		word.getAt(-1).each{num -> int lastDig = Integer.parseInt(num)
			aim += lastDig
		}
	}
	if(word.getAt(0) == "u"){
		word.getAt(-1).each{num -> int lastDig = Integer.parseInt(num)
			aim -= lastDig
		}
	} 
	if(word.getAt(0) == "f"){
		word.getAt(-1).each{num -> int lastDig = Integer.parseInt(num)
			length += lastDig
			depth = (aim * lastDig) + depth
		}		
	}
}
println "The final result is : " + depth * length
