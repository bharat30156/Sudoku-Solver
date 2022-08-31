import java.awt.Color;
import java.awt.GridLayout;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane; 
public class UI  implements ActionListener {
	    
		Solver sv = new Solver();
		JFrame f;
		JButton [][]jb = new JButton[9][9];
		int [][]arr = new int[9][9];
		
		Object[] selectionValues = {" ","1","2","3","4","5","6",
				                   "7","8","9","Solve", "Clear all"};
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			UI r = new UI();
			
			

		}
		
		UI()
			{
				f=new JFrame("Sudoku Solver");  
				f.setBounds(0, 0, 600, 600); 
			    f.setVisible(true); 
			    f.setBackground(Color.LIGHT_GRAY);
			    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    /*
			     *  I tried using below for loop
			     *  But didn't work 
			     *  
			        for(int i=0;i<9;i++){
			    	for(int j=0;j>9;j++){
			    		jb[i][j] = new JButton(" ");
			    		jb[i][j].addActionListener(this);
			    		f.add(jb[i][j]);
			    	}
			        }
			     * 
			     *  So you have to hard code 
			     *   everything
			     */

			    
				jb[0][0] = new JButton(" ");jb[0][1] = new JButton(" ");jb[0][2] = new JButton(" ");
				jb[0][3] = new JButton(" ");jb[0][4] = new JButton(" ");jb[0][5] = new JButton(" ");
				jb[0][6] = new JButton(" ");jb[0][7] = new JButton(" ");jb[0][8] = new JButton(" ");
			    jb[1][0] = new JButton(" ");jb[1][1] = new JButton(" ");jb[1][2] = new JButton(" ");
			    jb[1][3] = new JButton(" ");jb[1][4] = new JButton(" ");jb[1][5] = new JButton(" ");
				jb[1][6] = new JButton(" ");jb[1][7] = new JButton(" ");jb[1][8] = new JButton(" ");
				jb[2][0] = new JButton(" ");jb[2][1] = new JButton(" ");jb[2][2] = new JButton(" ");
				jb[2][3] = new JButton(" ");jb[2][4] = new JButton(" ");jb[2][5] = new JButton(" ");
				jb[2][6] = new JButton(" ");jb[2][7] = new JButton(" ");jb[2][8] = new JButton(" ");
				jb[3][0] = new JButton(" ");jb[3][1] = new JButton(" ");jb[3][2] = new JButton(" ");
				jb[3][3] = new JButton(" ");jb[3][4] = new JButton(" ");jb[3][5] = new JButton(" ");
				jb[3][6] = new JButton(" ");jb[3][7] = new JButton(" ");jb[3][8] = new JButton(" ");
				jb[4][0] = new JButton(" ");jb[4][1] = new JButton(" ");jb[4][2] = new JButton(" ");
				jb[4][3] = new JButton(" ");jb[4][4] = new JButton(" ");jb[4][5] = new JButton(" ");
				jb[4][6] = new JButton(" ");jb[4][7] = new JButton(" ");jb[4][8] = new JButton(" ");
				jb[5][0] = new JButton(" ");jb[5][1] = new JButton(" ");jb[5][2] = new JButton(" ");
				jb[5][3] = new JButton(" ");jb[5][4] = new JButton(" ");jb[5][5] = new JButton(" ");
				jb[5][6] = new JButton(" ");jb[5][7] = new JButton(" ");jb[5][8] = new JButton(" ");
				jb[6][0] = new JButton(" ");jb[6][1] = new JButton(" ");jb[6][2] = new JButton(" ");
				jb[6][3] = new JButton(" ");jb[6][4] = new JButton(" ");jb[6][5] = new JButton(" ");
				jb[6][6] = new JButton(" ");jb[6][7] = new JButton(" ");jb[6][8] = new JButton(" ");
				jb[7][0] = new JButton(" ");jb[7][1] = new JButton(" ");jb[7][2] = new JButton(" ");
				jb[7][3] = new JButton(" ");jb[7][4] = new JButton(" ");jb[7][5] = new JButton(" ");
				jb[7][6] = new JButton(" ");jb[7][7] = new JButton(" ");jb[7][8] = new JButton(" ");
				jb[8][0] = new JButton(" ");jb[8][1] = new JButton(" ");jb[8][2] = new JButton(" ");
				jb[8][3] = new JButton(" ");jb[8][4] = new JButton(" ");jb[8][5] = new JButton(" ");
				jb[8][6] = new JButton(" ");jb[8][7] = new JButton(" ");jb[8][8] = new JButton(" ");
				
				// action listener
				
				jb[0][0].addActionListener(this);jb[0][1].addActionListener(this);
				jb[0][2].addActionListener(this);jb[0][3].addActionListener(this);
				jb[0][4].addActionListener(this);jb[0][5].addActionListener(this);
				jb[0][6].addActionListener(this);jb[0][7].addActionListener(this);
				jb[0][8].addActionListener(this);jb[1][0].addActionListener(this);
				jb[1][1].addActionListener(this);jb[1][2].addActionListener(this);
				jb[1][3].addActionListener(this);jb[1][4].addActionListener(this);
				jb[1][5].addActionListener(this);jb[1][6].addActionListener(this);
				jb[1][7].addActionListener(this);jb[1][8].addActionListener(this);
				jb[2][0].addActionListener(this);jb[2][1].addActionListener(this);
			    jb[2][2].addActionListener(this);jb[2][3].addActionListener(this);
				jb[2][4].addActionListener(this);jb[2][5].addActionListener(this);
				jb[2][6].addActionListener(this);jb[2][7].addActionListener(this);
				jb[2][8].addActionListener(this);jb[3][0].addActionListener(this);
				jb[3][1].addActionListener(this);jb[3][2].addActionListener(this);
				jb[3][3].addActionListener(this);jb[3][4].addActionListener(this);
				jb[3][5].addActionListener(this);jb[3][6].addActionListener(this);
				jb[3][7].addActionListener(this);jb[3][8].addActionListener(this);
				jb[4][0].addActionListener(this);jb[4][1].addActionListener(this);
				jb[4][2].addActionListener(this);jb[4][3].addActionListener(this);
				jb[4][4].addActionListener(this);jb[4][5].addActionListener(this);
				jb[4][6].addActionListener(this);jb[4][7].addActionListener(this);
				jb[4][8].addActionListener(this);jb[5][0].addActionListener(this);
				jb[5][1].addActionListener(this);jb[5][2].addActionListener(this);
				jb[5][3].addActionListener(this);jb[5][4].addActionListener(this);
				jb[5][5].addActionListener(this);jb[5][6].addActionListener(this);
				jb[5][7].addActionListener(this);jb[5][8].addActionListener(this);
				jb[6][0].addActionListener(this);jb[6][1].addActionListener(this);
				jb[6][2].addActionListener(this);jb[6][3].addActionListener(this);
		        jb[6][4].addActionListener(this);jb[6][5].addActionListener(this);
				jb[6][6].addActionListener(this);jb[6][7].addActionListener(this);
				jb[6][8].addActionListener(this);jb[7][0].addActionListener(this);
				jb[7][1].addActionListener(this);jb[7][2].addActionListener(this);
				jb[7][3].addActionListener(this);jb[7][4].addActionListener(this);
				jb[7][5].addActionListener(this);jb[7][6].addActionListener(this);
				jb[7][7].addActionListener(this);jb[7][8].addActionListener(this);
				jb[8][0].addActionListener(this);jb[8][1].addActionListener(this);
				jb[8][2].addActionListener(this);jb[8][3].addActionListener(this);
				jb[8][4].addActionListener(this);jb[8][5].addActionListener(this);
				jb[8][6].addActionListener(this);jb[8][7].addActionListener(this);
				jb[8][8].addActionListener(this);
				
			
				// add to JFrame
				f.add(jb[0][0]);f.add(jb[0][1]);f.add(jb[0][2]);f.add(jb[0][3]);
				f.add(jb[0][4]);f.add(jb[0][5]);f.add(jb[0][6]);f.add(jb[0][7]);
				f.add(jb[0][8]);f.add(jb[1][0]);f.add(jb[1][1]);f.add(jb[1][2]);
				f.add(jb[1][3]);f.add(jb[1][4]);f.add(jb[1][5]);f.add(jb[1][6]);
		        f.add(jb[1][7]);f.add(jb[1][8]);f.add(jb[2][0]);f.add(jb[2][1]);
				f.add(jb[2][2]);f.add(jb[2][3]);f.add(jb[2][4]);f.add(jb[2][5]);
				f.add(jb[2][6]);f.add(jb[2][7]);f.add(jb[2][8]);f.add(jb[3][0]);
				f.add(jb[3][1]);f.add(jb[3][2]);f.add(jb[3][3]);f.add(jb[3][4]);
				f.add(jb[3][5]);f.add(jb[3][6]);f.add(jb[3][7]);f.add(jb[3][8]);
				f.add(jb[4][0]);f.add(jb[4][1]);f.add(jb[4][2]);f.add(jb[4][3]);
				f.add(jb[4][4]);f.add(jb[4][5]);f.add(jb[4][6]);f.add(jb[4][7]);
				f.add(jb[4][8]);f.add(jb[5][0]);f.add(jb[5][1]);f.add(jb[5][2]);
				f.add(jb[5][3]);f.add(jb[5][4]);f.add(jb[5][5]);f.add(jb[5][6]);
				f.add(jb[5][7]);f.add(jb[5][8]);f.add(jb[6][0]);f.add(jb[6][1]);
				f.add(jb[6][2]);f.add(jb[6][3]);f.add(jb[6][4]);f.add(jb[6][5]);
				f.add(jb[6][6]);f.add(jb[6][7]);f.add(jb[6][8]);f.add(jb[7][0]);
				f.add(jb[7][1]);f.add(jb[7][2]);f.add(jb[7][3]);f.add(jb[7][4]);
				f.add(jb[7][5]);f.add(jb[7][6]);f.add(jb[7][7]);f.add(jb[7][8]);
				f.add(jb[8][0]);f.add(jb[8][1]);f.add(jb[8][2]);f.add(jb[8][3]);
				f.add(jb[8][4]);f.add(jb[8][5]);f.add(jb[8][6]);f.add(jb[8][7]);
				f.add(jb[8][8]);
		        
			    
			    
			   
			    
			   
				
			    f.setLayout(new GridLayout(9,9));  
			    //setting grid layout of 3 rows and 3 columns  
			   
			     
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0;i<9;i++){
					for(int j=0;j<9;j++){
						if(e.getSource()==jb[i][j]){
							JDialog.setDefaultLookAndFeelDecorated(true);
							String initialSelection = " ";
							Object selection = JOptionPane.showInputDialog(null, "Select a number or solve",
							"Select options", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
							if(!selection.toString().equals(selectionValues[10].toString()) &&
							!selection.toString().equals(selectionValues[0].toString()) && 
							!selection.toString().equals(selectionValues[11].toString())
							)
							{jb[i][j].setText(selection.toString());
							try{arr[i][j] =Integer.parseInt(selection.toString());}
							catch(Exception e1){
								e1.printStackTrace();
							}}
							if(selection.toString().equals(selectionValues[0].toString())){
							arr[i][j]=0;
							jb[i][j].setText(" ");}

							if(selection.toString().equals(selectionValues[10].toString())) {
						    if(sv.solve(arr))  // If solution exist print and update the board
							 updateView();
						    else {
							  JOptionPane.showMessageDialog(null, "Solution doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
							}}
							
							// call clearAll() method to clean the board
							if(selection.toString().equals(selectionValues[11].toString())){
								clearAll();
							}
							}}
				}
				


					
			}
			
			/*
			 *  Will update view on
			 *  JFrame and also print the result
			 */
			public void updateView(){
				
				System.out.println(Arrays.deepToString(arr).replace("],", "],\n"));
				
				for(int i=0;i<9;i++){
					for(int j=0;j<9;j++){
						jb[i][j].setText(arr[i][j]+" ");
					}
				}
				
			}
			/*
			 *  Will clear everything in the board
			 *  and will initialize all element to zero
			 */
			public void clearAll(){
				for(int i=0;i<9;i++){
					for(int j=0;j<9;j++){
						arr[i][j]=0;
						jb[i][j].setText("");
					}
				}
			}
			
			
		

		


}