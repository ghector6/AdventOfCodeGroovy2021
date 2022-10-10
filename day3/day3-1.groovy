def test = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day3/inputday3.txt").text

def zeroFlag = []
def oneFlag = 0
def ceroflag = 0

test.eachLine{line ->
	line.eachWithIndex{num, index ->
		if(index == 1){
			zeroFlag << num
		}
	}
}
zeroFlag.findAll{element -> 
	if(element == "1"){
		oneFlag ++
	}else if(element == "0"){
		ceroflag++
	}

} 

println ceroflag