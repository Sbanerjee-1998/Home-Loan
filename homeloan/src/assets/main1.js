
            var Form1 = document.getElementById("Form1");
            var Form2 = document.getElementById("Form2");
            var Form3 = document.getElementById("Form3");
            var Form4 = document.getElementById("Form4");
           
            var Next1 = document.getElementById("Next1");
            var Next2 = document.getElementById("Next2");
            var Next3 = document.getElementById("Next3");
            
            var Back1 = document.getElementById("Back1");
            var Back2 = document.getElementById("Back2");
            var Back3 = document.getElementById("Back3");

            var progress = document.getElementById("progress");
            


            Next1.onclick=function(){
                Form1.style.left="-600px";
                Form2.style.left="250px";
                progress.style.width="400px";
            }
            Back1.onclick=function(){
                Form1.style.left="250px";
                Form2.style.left="-600px";
                progress.style.width="200px";
            }

            Next2.onclick=function(){
                Form2.style.left="-600px";
                Form3.style.left="250px";
                progress.style.width="600px";

            }
            Back2.onclick=function(){
                Form2.style.left="250px";
                Form3.style.left="-600px";
                progress.style.width="400px";
            }

            Next3.onclick=function(){
                Form3.style.left="-600px";
                Form4.style.left="250px";
                progress.style.width="800px";
            }

            Back3.onclick=function(){
                Form3.style.left="250px";
                Form4.style.left="-600px";
                progress.style.width="600px";
            }
			
		

                     

            
      