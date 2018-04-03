//var canvas = document.getElementById("myCanvas");      // получение canvas по id
//var ctx = canvas.getContext("2d");



function addname(){
    var myName = document.getElementById("anim_name").value;





var red = [0, 100, 63];
var orange = [40, 100, 60];
var green = [75, 100, 40];
var blue = [196, 77, 55];
var purple = [280, 50, 60];
var letterColors = [red, orange, green, blue, purple];

drawName(myName, letterColors);

if(10 < 3)
{
    bubbleShape = 'square';
}
else
{
    bubbleShape = 'circle';
}


}

bounceBubbles();

function clearCanvas(){
	var canvas = document.getElementById("myCanvas");
	var ctx = canvas.getContext("2d");
	ctx.clear;
}