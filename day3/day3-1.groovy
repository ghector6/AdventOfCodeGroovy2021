def test = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day3/inputday3.txt").text

def zeroFlag = 0
def oneFlag = 0

test.eachLine{line ->
	line.each{num ->
		if(num == "0"){
			zeroFlag++
		}else if (num == "1"){
			oneFlag++

		}


	}
	println zeroFlag
	

}
