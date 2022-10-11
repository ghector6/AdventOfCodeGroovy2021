def test = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day3/inputday3.txt").text

def zeroFlag = []
def oneFlag = 0
def ceroflag = 0
def gammaRate
def lines = test.split("\n").size()


lines.times{lineNum -> 
	test.eachLine{line -> //this part iterates through the given index of the data lines
		line.eachWithIndex{num, index ->
			if(index == lineNum){
				zeroFlag << num
			}
		}
	}
}



println zeroFlag
/*
zeroFlag.findAll{element -> 
	if(element == "1"){
		oneFlag ++
	}else if(element == "0"){
		ceroflag++
	}


} 

if(oneFlag > ceroflag){
	gammaRate = "1"
}else{
	gammaRate ="0"

}

println gammaRate*/