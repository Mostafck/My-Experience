using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace russia_square
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            mainpanel = panel1;
        }
        number_of_squares S = new number_of_squares();

        private void Form1_Load(object sender, EventArgs e)
        {
            S.creatsquare();
            S.printasquare();
            S.creatsinglesquare();
            S.printsinglesquar();

        }
        string key;
        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            switch ((System.Windows.Forms.Keys)e.KeyValue)
            {
                case Keys.Up:
                    key = "Up";
                    break;
                case Keys.Down:
                    key = "Down";
                    break;
                case Keys.Right:
                    key = "Right";
                    break;
                case Keys.Left:
                    key = "Left";
                    break;
            }
            S.movesinglesquar(key);
            S.printsinglesquar();
            int x = S.checkrow();
            if (x>=0)
            {
                S.removerow(x,key);
            }
            int y = S.checkcolumn();
            if (y >= 0)
            {
                S.removerow(y, key);
            }
        }
    }
}
