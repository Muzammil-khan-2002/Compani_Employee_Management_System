import java.util.*;
class Employee 
{
	private int id;
	private String name;
	private String email;
	private String con;
	private String add;
	private int sal;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	
	public void setContact(String con)
	{
		this.con=con;
	}
	public String getContact()
	{
		return con;
	}
	
	public void setAddress(String add)
	{
		this.add=add;
	}
	public String getAddress()
	{
		return add;
	}
	
	public void setSalary(int sal)
	{
		this.sal=sal;
	}
	public int getSalary()
	{
		return sal;
	}
}

class Company
{
	Scanner xyz=new Scanner(System.in);
	Employee emp[];
	int count=0;
	Company(Employee emp[])
	{
		this.emp=emp;
	}
	void employeeOperation()
	{
		int choice=0;
		char sub_choice='A';
		System.out.println("\n\t_________________________________________________________________________");
		do
		{
			
			System.out.println("\n\n1-Add New Employee Detail :\t");
			System.out.println("2-Show Employee Detail :\t");
			System.out.println("3-Search Employee Detail, Using :\t");
			System.out.println("4-Delete Employee Detail, Using :\t");
			System.out.println("5-Update Employee Detail, Using :\t");
			System.out.println("6-Sorting Employee details :\t");
			System.out.println("7-Display Employee Recorde whose Highest Salary :\t");
			System.out.println("8-Display Employee Recorde whose Second Highest Salary :\t");
			System.out.println("9-Display Employee Recorde whose Salary Between 10000 - 50000:\t");
			System.out.println("0-Terminate the Code:\t");
			System.out.println("\nEnter Your Valid Choice?\t");
			choice=xyz.nextInt();
			
			switch(choice)
			{
				case 1:{
							if(count<emp.length)
							{
								
								emp[count]=new Employee();
								System.out.println("\n\n\t\tEnter "+(count+1)+" Employee Details :");
								System.out.println("--------------------------------------------------");
								System.out.println("entre id");
								int id=xyz.nextInt();
								xyz.nextLine();
								System.out.println("entre name");
								String name=xyz.nextLine();
								System.out.println("entre email");
								String email=xyz.nextLine();
								System.out.println("entre contact");
								String con=xyz.nextLine();
								System.out.println("entre salary");
								int sal=xyz.nextInt();
								xyz.nextLine();
								System.out.println("enter address");
								String add=xyz.nextLine();
								emp[count].setId(id);
								emp[count].setName(name);
								emp[count].setEmail(email);
								emp[count].setContact(con);
								emp[count].setSalary(sal);
								emp[count].setAddress(add);
								++count;
								
							}
							else
							{
								System.out.println("Can not Enter New Employee,Range is Full!");
							}
					}
						break;
				case 2:{
							if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
							else{
								System.out.println("\n\n\t\tDisplay Employee Details : ");
								System.out.println("______________________________________________");
								System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
								for(int i=0;i<count;i++)
								{
									System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getAddress());
								}
									System.out.println("\n____________________________________________________\n\n");
								}
						}
						break;
				case 3:{
						if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
						 else
						 {	
							do
							{
								System.out.println("\n\n\t A-ID");
								System.out.println("\t B-NAME");
								System.out.println("\t C-EMAIL");
								System.out.println("\t D-CONTACT");
								System.out.println("\t E-SALARY");
								System.out.println("\t F-ADDRESS");
								System.out.println("\t X-Stop!");
								System.out.println("\nSelect Any Valid Option?\t");
								sub_choice=xyz.next().charAt(0);
								switch(sub_choice)
								{
									case 'a':
									case 'A':
												{
													boolean once=true;
													boolean f=true;
													int point=0;
													System.out.println("\nEnter Id for Search?\t");
													int s_id=xyz.nextInt();
													for(int i=0;i<count;i++)
													{
														if(s_id==emp[i].getId())
														{
															if(once)
															{
															System.out.println("\n\nRecorde Founded: ");
															System.out.println("\t\t__________________________________________");
															System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
				
															System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getAddress()+"\n");
															once=false;
															}
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nId "+s_id+" Employee Recorde not Founded!\n");
													}
													
												}
												break;
									case 'b':
									case 'B':
												{
													boolean once=true;
													boolean f=true;
													int point=0;
													
													System.out.println("\nEnter Name for Search?\t");
													xyz.nextLine();
													String s_name=xyz.nextLine();
													
													for(int i=0;i<count;i++)
													{
														if((s_name).equalsIgnoreCase(emp[i].getName()))
														{
															if(once)
															{
															System.out.println("\nRecorde Founded: ");
															System.out.println("\t\t__________________________________________");
															System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
															System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getAddress()+"\n");
															once=false;
															}
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nName "+s_name+" Employee Recorde not Founded!");
													}
												}
												break;
							
									case 'c':
									case 'C':
												{
													boolean once=true;
													boolean f=true;
													int point=0;
													
													System.out.println("\nEnter Email for Search?\t");
													xyz.nextLine();
													String s_email=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_email).equalsIgnoreCase(emp[i].getEmail()))
														{
															if(once)
															{
															System.out.println("\nRecorde Founded: ");
															System.out.println("\t\t__________________________________________");
															System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
															System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getAddress()+"\n");
															once=false;
															}
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nEmail "+s_email+" Employee Recorde not Founded!");
													}
												}
												break;
												
									case 'd':
									case 'D':
												{
													boolean once=true;
													boolean f=true;
													int point=0;
													
													System.out.println("\nEnter Contact Number for Search?\t");
													xyz.nextLine();
													String s_contact=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_contact).equalsIgnoreCase(emp[i].getContact()))
														{
															if(once)
															{
															System.out.println("\nRecorde Founded: ");
															System.out.println("\t\t__________________________________________");
															System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
															System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getAddress()+"\n");
															once=false;
															}
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nContact "+s_contact+" Employee Recorde not Founded!");
													}
												}
												break;
									case 'e':
									case 'E':
												{
													boolean once=true;
													boolean f=true;
													int point=0;
													System.out.println("\nEnter Salary for Search?\t");
													int s_salary=xyz.nextInt();
													for(int i=0;i<count;i++)
													{
														if(s_salary==emp[i].getSalary())
														{
															if(once)
															{
															System.out.println("\nRecorde Founded: ");
															System.out.println("\t\t__________________________________________");
															System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
															System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getAddress()+"\n");
															once=false;
															}
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nSalary "+s_salary+" Employee Recorde not Founded!");
													}
												}
												break;
									case 'f':
									case 'F':
												{
													boolean once=true;
													boolean f=true;
													int point=0;
													
													System.out.println("\nEnter Address for Search?\t");
													xyz.nextLine();
													String s_address=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_address).equalsIgnoreCase(emp[i].getAddress()))
														{
															if(once)
															{
															System.out.println("\nRecorde Founded: ");
															System.out.println("\t\t__________________________________________");
															System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
															System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getAddress()+"\n");
															once=false;
															}
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nAddress "+s_address+" Employee Recorde not Founded!");
													}
												}
												break;
									case 'x':
									case 'X':{System.out.println("\nExisting...");}
												
								}
								
							}while(sub_choice!='X' && sub_choice!='x');
						 }				
						}
						break;
				case 4:
						{
						if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
						 else
						 {		
							Employee delete[]=new Employee[emp.length];
							do
							{
								
								System.out.println("\n\n\t A-ID");
								System.out.println("\t B-NAME");
								System.out.println("\t C-EMAIL");
								System.out.println("\t D-CONTACT");
								System.out.println("\t E-SALARY");
								System.out.println("\t F-ADDRESS");
								System.out.println("\t X-Stop!");
								System.out.println("\nSelect Any Valid Option?\t");
								sub_choice=xyz.next().charAt(0);
								switch(sub_choice)
								{
									case 'a':
									case 'A':
											{
													boolean f=true;
													int point=0;
													System.out.println("\nEnter Id for delete The Recorde?\t");
													int s_id=xyz.nextInt();
													for(int i=0;i<count;i++)
													{
														if(s_id==emp[i].getId())
														{
															if(s_id==emp[i].getId())
															{
																
																for(int j=i;j<count-1;j++)
																{
																	emp[j]=emp[j+1];
																	
																}
															}
															
															
															emp[count-1]=null;
															--count;
															
														}
														else{f=false;
														++point;}
													}
													
													if(f==false && point==count)
													{
	
															System.out.println("\nId "+s_id+" Employee Recorde not Founded!\n");
													}
													else
														System.out.println("\n\t-->Delete Record Succesfully!");
													
												}
												break;
												
									case 'b':
									case 'B':
												{
													boolean f=true;
													int point=0;
													System.out.println("\nEnter Name for delete The Recorde?\t");
													xyz.nextLine();
													String s_name=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_name).equalsIgnoreCase(emp[i].getName()))
														{
															if((s_name).equalsIgnoreCase(emp[i].getName()))
															{
																
																for(int j=i;j<count-1;j++)
																{
																	emp[j]=emp[j+1];
																}
															}
															emp[count-1]=null;
															--count;
															
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nName "+s_name+" Employee Recorde not Founded!\n");
													}
													else
														System.out.println("\n\t-->Delete Record Succesfully!");
												}
												break;
												
									case 'c':
									case 'C':
												{
													boolean f=true;
													int point=0;
													System.out.println("\nEnter Email for delete The Recorde?\t");
													xyz.nextLine();
													String s_email=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_email).equalsIgnoreCase(emp[i].getEmail()))
														{
															if((s_email).equalsIgnoreCase(emp[i].getEmail()))
															{
																
																for(int j=i;j<count-1;j++)
																{
																	emp[j]=emp[j+1];
																}
															}
															emp[count-1]=null;
															--count;
															
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nEmail "+s_email+" Employee Recorde not Founded!\n");
													}
													else
														System.out.println("\n\t-->Delete Record Succesfully!");
												}
												break;
											
									case 'd':
									case 'D':
												{
													boolean f=true;
													int point=0;
													System.out.println("\nEnter Contact for delete The Recorde?\t");
													xyz.nextLine();
													String s_contact=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_contact).equalsIgnoreCase(emp[i].getContact()))
														{
															if((s_contact).equalsIgnoreCase(emp[i].getContact()))
															{
																
																for(int j=i;j<count-1;j++)
																{
																	emp[j]=emp[j+1];
																}
															}
															emp[count-1]=null;
															--count;
															
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nContact "+s_contact+" Employee Recorde not Founded!\n");
													}
													else
														System.out.println("\n\t-->Delete Record Succesfully!");
												}
												break;
									
									case 'e':
									case 'E':
												{
													boolean f=true;
													int point=0;
													System.out.println("\nEnter Salary for delete The Recorde?\t");
													int s_salary=xyz.nextInt();
													for(int i=0;i<count;i++)
													{
														if(s_salary==emp[i].getSalary())
														{
															if(s_salary==emp[i].getSalary())
															{
																
																for(int j=i;j<count-1;j++)
																{
																	emp[j]=emp[j+1];
																}
															}
															emp[count-1]=null;
															--count;
															
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nSalary "+s_salary+" Employee Recorde not Founded!\n");
													}
													else
														System.out.println("\n\t-->Delete Record Succesfully!");
												}
												break;
												
									case 'f':
									case 'F':
												{
													boolean f=true;
													int point=0;
													System.out.println("Enter Address for delete the Recorde?\t");
													xyz.nextLine();
													String s_address=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_address).equalsIgnoreCase(emp[i].getAddress()))
														{
															if((s_address).equalsIgnoreCase(emp[i].getAddress()))
															{
																for(int j=i;j<count-1;j++)
																{
																	emp[j]=emp[j+1];
																}
															}
															emp[count-1]=null;
															--count;
														}
														else{
														++point;
														f=false;
														}
													}
													if(point==count && f==false)
													{
														System.out.println("\nAddress "+s_address+" Employee Recorde not Founded!\n");
													}
													else
														System.out.println("\n\t-->Delete Record Succesfully!");
												}
												break;
									
									case 'x':
									case 'X':{System.out.println("\nExisting...");}

								}
							}while(sub_choice!='X' && sub_choice!='x');
						 }
						}
						break;
				case 5:
						{
							
						if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
						 else
						 {	
							
							
							do
							{
								System.out.println("\n\n\t A-ID");
								System.out.println("\t B-NAME");
								System.out.println("\t C-EMAIL");
								System.out.println("\t D-CONTACT");
								System.out.println("\t E-SALARY");
								System.out.println("\t F-ADDRESS");
								System.out.println("\t X-Stop!");
								System.out.println("\nSelect Any Valid Option?\t");
								sub_choice=xyz.next().charAt(0);
								switch(sub_choice)
								{
									case 'a':
									case 'A':
												{
													boolean f=true;
													int point=0;
													xyz.nextLine();
													System.out.println("\nEnter old Id for Update?\t");
													int s_id=xyz.nextInt();
													for(int i=0;i<count;i++)
													{
														if(s_id==emp[i].getId())
														{
															System.out.println("enter New id");
															int up_id=xyz.nextInt();
															emp[i].setId(up_id);
															System.out.println("\n\nold Id is Updated.: ");
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nId "+s_id+" not Founded!\n");
													}
													else
														System.out.println("\n\t-->Updated Record Succesfully!");
												}
												break;
												
									case 'b':
									case 'B':
												{
													boolean f=true;
													int point=0;
													xyz.nextLine();
													System.out.println("\nEnter old Name for Update?\t");
													String s_name=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_name).equalsIgnoreCase(emp[i].getName()))
														{
															System.out.println("enter New Name");
															String up_name=xyz.nextLine();
															emp[i].setName(up_name);
															System.out.println("\nold Name is Updated.: ");
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nId "+s_name+" not Founded!\n");
													}
													else
														System.out.println("\n\t-->Updated Record Succesfully!");
												}
												break;
												
									case 'c':
									case 'C':
												{
													boolean f=true;
													int point=0;
													xyz.nextLine();
													System.out.println("\nEnter old email for Update?\t");
													String s_email=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_email).equalsIgnoreCase(emp[i].getEmail()))
														{
															System.out.println("enter New Email");
															String up_email=xyz.nextLine();
															emp[i].setEmail(up_email);
															System.out.println("\nold email is Updated.: ");
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nId "+s_email+" not Founded!\n");
													}
													else
														System.out.println("\n\t-->Updated Record Succesfully!");
												}
												break;
									case 'd':
									case 'D':
												{
													boolean f=true;
													int point=0;
													xyz.nextLine();
													System.out.println("\nEnter old contact number for Update?\t");
													String s_contact=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_contact).equalsIgnoreCase(emp[i].getContact()))
														{
															System.out.println("enter New Contact");
															String up_contact=xyz.nextLine();
															emp[i].setContact(up_contact);
															System.out.println("\nold contact is Updated.: ");
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nId "+s_contact+" not Founded!\n");
													}
													else
														System.out.println("\n\t-->Updated Record Succesfully!");
												}
												break;

									case 'e':
									case 'E':
												{
													boolean f=true;
													int point=0;
													xyz.nextLine();
													System.out.println("\nEnter Salary for Update?\t");
													int s_salary=xyz.nextInt();
													for(int i=0;i<count;i++)
													{
														if(s_salary==emp[i].getSalary())
														{
															System.out.println("enter New Salary");
															int up_salary=xyz.nextInt();
															emp[i].setSalary(up_salary);
															System.out.println("\nSalary is Updated.: ");
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nSalary "+s_salary+" not Founded!\n");
													}
													else
														System.out.println("\n\t-->Updated Record Succesfully!");
												}
												break;

									case 'f':
									case 'F':
												{
													boolean f=true;
													int point=0;
													xyz.nextLine();
													System.out.println("\nEnter old Address number for Update?\t");
													String s_address=xyz.nextLine();
													for(int i=0;i<count;i++)
													{
														if((s_address).equalsIgnoreCase(emp[i].getAddress()))
														{
															System.out.println("enter New Address");
															String up_address=xyz.nextLine();
															emp[i].setAddress(up_address);
															System.out.println("\nold Address is Updated.: ");
														}
														else{f=false;
														++point;}
													}
													if(f==false && point==count)
													{
	
															System.out.println("\nAddress "+s_address+" not Founded!\n");
													}
													else
														System.out.println("\n\t-->Updated Record Succesfully!");
												}
												break;
									case 'x':
									case 'X':{System.out.println("\nExisting...");}
								}
							}while(sub_choice!='X' && sub_choice!='x');
						 }
						}
						break;
				case 6:
						{
							
						if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
						 else
						 {	
							
							Employee assId;
							do
							{
								System.out.println("\t\n\n A-ID by ascending ");
								System.out.println("\t B-Salary by Decending");
								System.out.println("\t X-Stop!");
								System.out.println("\nSelect Any Valid Option?\t");
								sub_choice=xyz.next().charAt(0);
								switch(sub_choice)
								{
									case 'a':
									case 'A':
												{
													for(int i=0;i<count;i++)
													{
														for(int j=i+1;j<count;j++)
														{
															if(emp[i].getId()>emp[j].getId())
															{
																assId=emp[i];
																emp[i]=emp[j];
																emp[j]=assId;
															}
														}
													}
												}
												break;
												
									case 'b':
									case 'B':
												{
													Employee dessSal;
													for(int i=0;i<count;i++)
													{
														for(int j=i+1;j<count;j++)
														{
															if(emp[i].getSalary()<emp[j].getSalary())
															{
																dessSal=emp[i];
																emp[i]=emp[j];
																emp[j]=dessSal;
															}
														}
													}
												}
												break;
												
									case 'x':
									case 'X':{System.out.println("\nExisting...");}
								}
							}while(sub_choice!='X' && sub_choice!='x');
						 }
						}
						break;
				case 7:
						{
							
						if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
						 else
						 {		
							
							Employee max=emp[0];
							for(int i=0;i<count;i++)
							{
								if(emp[i].getSalary()>max.getSalary())
								{
									max=emp[i];
								}
							}
							System.out.println("Highest Salary Recorde :");
							System.out.println("\t\t__________________________________________");
							System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
							System.out.println("\n"+max.getId()+"\t"+max.getName()+"\t"+max.getEmail()+"\t"+max.getContact()+"\t"+max.getSalary()+"\t"+max.getSalary()+"\n");
							
						  }
						}
						break;
				case 8:
						{
						if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
						 else
						 {	
							
							Employee max=emp[0];
							Employee min=emp[0];
							Employee smax=emp[0];
							for(int i=0;i<count;i++)
							{
								if(emp[i].getSalary()>max.getSalary())
								{
									max=emp[i];
								}
								if(emp[i].getSalary()<min.getSalary())
								{
									min=emp[i];
								}
							}
							for(int i=0;i<count;i++)
							{
								if(emp[i].getSalary()<max.getSalary() && emp[i].getSalary()>min.getSalary())
								{
									smax=emp[i];
								}
							}
							
							System.out.println("Second Highest Salary Recorde :");
							System.out.println("\t\t__________________________________________");
							System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
							System.out.println("\n"+smax.getId()+"\t"+smax.getName()+"\t"+smax.getEmail()+"\t"+smax.getContact()+"\t"+smax.getSalary()+"\t"+smax.getSalary()+"\n");
							
						 }	
						}
						break;
				case 9:
						{
							if((count)<=0)
							{
								System.out.println("\n\t\tEmpty!,\n\t\tNot Any Recorde!");
							}
						 else
						 {	
							boolean once=true;
							for(int i=0;i<count;i++)
							{
								if(emp[i].getSalary() >=10000 && emp[i].getSalary()<=50000)
								{
									if(once)
									{
									System.out.println("\nRecorde Founded: ");
									System.out.println("\t\t__________________________________________");
									System.out.println("ID\tNAME\tEMAIL\tCONTACT\tSALARY\tADDRESS");
									once=false;
									}
									System.out.println("\n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getEmail()+"\t"+emp[i].getContact()+"\t"+emp[i].getSalary()+"\t"+emp[i].getSalary()+"\n");
								}
								else
								{
									System.out.println("\n\tNot Any Record Salary Between  10000 - 50000");
								}
							}
						 }
						}
						break;
				case 0:{
							System.out.println("\nTerminate The Code!, Exiting...");
						}
						break;
				default:System.out.println("Invalid Input!");
			}
		}while(choice!=0);
	}
	
}

public class ProjectCompanyApp
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Total Range of Capacity of Employee?\t");
		int range=xyz.nextInt();
		Employee emp[]=new Employee[range];
		Company com=new Company(emp);
		com.employeeOperation();
	}
}
