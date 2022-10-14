def test = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day3/inputday3.txt").text

//def zeroFlag = []
//def oneFlag = 0

//def gammaRate =  []
def lines = test.split("\n").first().split("").size()
def matrix = []


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
	matrix.each{it -> println it}
	def gammaRate = []
	matrix.each{matrixArray -> 
		
		if(matrixArray.count("0") > matrixArray.count("1")){
			gammaRate << 0

		}else{
			gammaRate << 1
		}


		 
		//def ceroCounter = 0
		//def oneCounter = 0
		//matrixArray.findAll{ element ->
			//if(element == "0"){
				//ceroCounter++
			//}else if(element == "1"){
			//	oneCounter++
			//}

		//}
		


	}
	println gammaRate
	
}

/*matrix.findAll{element -> 
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