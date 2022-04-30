(function(){
    self.Board = function (width, height) {
        this.width = width;
        this.height = height;
        this.playing = false;
        this.game_over = false;
        this.bars = [];
        this.ball = null;
      };
    
      self.Board.prototype = {
        get elements() {
          var elements = this.bars.map(function (bar) {
            return bar;
          });
          elements.push(this.ball);
          return elements;
        },
      };

})();

(function () {
    self.Bar = function (x, y, width, height, board) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.board = board;
      this.board.bars.push(this);
      console.log(this.board.bars)
      this.kind = "rectangle";
      this.speed = 10;
    };
  
    self.Bar.prototype = {
      down: function () {
        this.y += this.speed;
      },
      up: function () {
        this.y -= this.speed;
      },
      toString: function () {
        return "x: " + this.x + "y: " + this.y;
      },
    };
  })();


(function(){
    self.BoardView=function(canvas,board){
        this.canvas = canvas;
        this.canvas.width = board.width;
        this.canvas.height = board.height;
        this.board = board;
        this.cxt = canvas.getContext("2d");
    }

    self.BoardView.prototype = {
        clean: function () {
          this.cxt.clearRect(0, 0, this.board.width, this.board.height);
        },//
        draw: function () {
          for (var i = this.board.elements.length - 1; i >= 0; i--) {
            var el = this.board.elements[i];
            console.log(el)
            draw(this.cxt, el);
          }
        },
        check_collisions: function () {
          for (var i = this.board.bars.length - 1; i >= 0; i--) {
            var bar = this.board.bars[i];
            if (hit(bar, this.board.ball)) {
              this.board.ball.collision(bar);
            }
          }
        },//
        play: function () {
          if (this.board.playing) {
            this.clean();
            this.draw();
            this.check_collisions();
            this.board.ball.move();
          }
        },//
      };

    function draw(cxt, element) {
        if(element!==null && element.hasOwnProperty("kind")){
        switch (element.kind) {
          case "rectangle":
            cxt.fillRect(element.x, element.y, element.width, element.height);
            break;
    
          case "circle"://
            cxt.beginPath();
            cxt.arc(element.x, element.y, element.radius, 0, 7);
            cxt.fill();
            cxt.closePath();
            break;
        }
      }
    }
})();
var board=new Board(800,400);
var bar=new Bar(20,100,40,100,board);
var bar=new Bar(700,100,40,100,board);
var canvas=document.getElementById('canvas');
var board_view=new BoardView(canvas,board); 

document.addEventListener("keydown",function(event){   
    if(event.keyCode==38){
        bar.up();
    }
    else if(event.keyCode==40){
        bar.down();
    }
    console.log(bar.toString());
});
 
self,addEventListener('load',main);


function main(){
    
    board_view.draw();
}