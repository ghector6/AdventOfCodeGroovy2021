def test = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day3/inputday3.txt").text
def lines = test.split("\n").first().split("").size()
def matrix = []
int gammaDecimal
int epsilonDecimal 


lines.times{lineNum -> 
	def newline = []//this part iterates through the given index of the data lines
	test.eachLine{line ->   		
		line.eachWithIndex{num, index ->
			if(index == lineNum){
				newline << num
			}
		}		
	}
	matrix << newline	
	def gammaRate = []
	matrix.each{matrixArray -> 
		
		if(matrixArray.count("0") > matrixArray.count("1")){
			gammaRate << 0

		}else{
			gammaRate << 1
		}

	}
	def epsilonRate = []
	for(num in gammaRate){
		if(num == 0){
			num = 1
		}else if(num == 1){
			num = 0
		}
		epsilonRate << num

	}
	epsilonDecimal = epsilonRate.reverse().indexed().collect{idx,num -> num * (2 ** idx)}.sum()
	gammaDecimal = gammaRate.reverse().indexed().collect{idx,num -> num * (2 ** idx)}.sum()

	
}
println gammaDecimal * epsilonDecimal

