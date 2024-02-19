using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
namespace russia_square
{
    class square
    {
        int x;
        int y;
        PictureBox squarepic;
        public square()
        {
             x = 0;
             y = 0;
            squarepic = new PictureBox();
        
        }
        
        
        public int X
        {
            get { return x; }
            set { x = value; }
        }
        public int Y
        {
            get { return y; }
            set { y = value; }
        }
        public PictureBox squarePIC
        {
            get { return squarepic; }
            set { squarepic = value; }
        }

    }
}
