//output js : 
//1. alert('hello javascript'); -> user
//2. console -> developer
console.log('hello javascript via console');
//4. access DOM
//document.getElementById("output").innerHTML = "Programming";

//event listener
document.getElementById("btn").addEventListener('click', function(){
	document.getElementById("output").innerHTML = "Programming";
});

//deklarasi variable
var nama = "aldi";
var saldo = 5000.0;
var age = 12;

//function
function getName(){
	return nama;
}

function getAge(){
	return age;
}

function getInfo(){
	name = getName();
	age = getAge();
	
	//JSON -> javascript Object Notation
	var oPeserta = {
		nama : name,
		age : age,
		saldo : saldo
	};
	
	return oPeserta;
}

//javascript Object
console.log(getInfo());
var obj = getInfo();
//alert("nama : "+ obj.nama);