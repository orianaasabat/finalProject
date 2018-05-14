package swerProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;

public class framee1 extends JFrame {
	ArrayList<Person> persons = new ArrayList<Person>();
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Employee> employees = new ArrayList<Employee>();
	ArrayList<Adminstrator> admin = new ArrayList<Adminstrator>();
	public static JLabel label_2;
	public static JLabel label;
	public static JLabel label_5;
	public static JLabel label_4;
	public static JLabel label_1;
	public static JLabel label_3;
	public static JPanel panel_2;
	public static JButton update;
	public ArrayList<Student> matchingStudents;
	public static JButton saveUpdate;
	private JPanel contentPane;
	private JTextField studentName;
	private JTextField studentage;
	private JTextField studentgrade;
	private JTextField studentcity;
	private JTextField studenthouse;
	private JTextField studentstreet;
	private JTextField employeename;
	private JTextField employeeage;
	private JTextField employeesalary;
	private JTextField employeecity;
	private JTextField employeehouse;
	private JTextField employeestreet;
	private JTextField username;

	private JTextField password;
	private JTextField name;
	public static int i = 0;
	public static int y =0;
	public static int w = 0;
	public static JButton btnNext;
	public static int btnnext = 0;
	public static JTextArea write;
	private JTextField salarytxt;
	private JTextField reportedtxt;
	private JTextField nametxt;
	private JTextField agetxt;
	private JTextField gstxt;
	private JTextField citytxt;
	private JTextField housetxt;
	private JTextField streettxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framee1 frame = new framee1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// main

	/**
	 * Create the frame.
	 */
	public framee1() {
		// getContentPane().setLayout(new FormLayout(new ColumnSpec[] {}, new RowSpec[]
		// {}));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("Add Students");
		tabbedPane.setBounds(15, 0, 743, 488);
		contentPane.add(tabbedPane);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Add an Adminstrator", null, panel_3, null);
		panel_3.setLayout(null);

		username = new JTextField();
		username.setBounds(151, 16, 146, 26);
		panel_3.add(username);
		username.setColumns(10);

		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBounds(23, 19, 131, 20);
		panel_3.add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(23, 61, 102, 20);
		panel_3.add(lblPassword);

		password = new JTextField();
		password.setBounds(151, 58, 146, 26);
		panel_3.add(password);
		password.setColumns(10);

		JButton btnSave = new JButton("Add an Adminstrator");
		btnSave.setBounds(289, 212, 115, 29);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username1 = username.getText();
				String password1 = password.getText();
				admin.add(new Adminstrator(username1, password1));
			}
		});
		panel_3.add(btnSave);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 5, 5);
		panel_3.add(tabbedPane_1);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Employee", null, panel, null);
		panel.setLayout(null);

		employeename = new JTextField();
		employeename.setBounds(0, 16, 146, 26);
		panel.add(employeename);
		employeename.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(179, 22, 69, 20);
		panel.add(lblName);

		JLabel lblAge_1 = new JLabel("Age");
		lblAge_1.setBounds(179, 58, 69, 20);
		panel.add(lblAge_1);

		employeeage = new JTextField();
		employeeage.setBounds(0, 58, 146, 26);
		panel.add(employeeage);
		employeeage.setColumns(10);

		employeesalary = new JTextField();
		employeesalary.setBounds(0, 100, 146, 26);
		panel.add(employeesalary);
		employeesalary.setColumns(10);

		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(179, 103, 69, 20);
		panel.add(lblSalary);

		employeecity = new JTextField();
		employeecity.setBounds(0, 140, 146, 26);
		panel.add(employeecity);
		employeecity.setColumns(10);

		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setBounds(179, 143, 69, 20);
		panel.add(lblCity_1);

		JLabel lblHouseNumber = new JLabel("House Number");
		lblHouseNumber.setBounds(179, 188, 120, 20);
		panel.add(lblHouseNumber);

		employeehouse = new JTextField();
		employeehouse.setBounds(0, 185, 146, 26);
		panel.add(employeehouse);
		employeehouse.setColumns(10);

		employeestreet = new JTextField();
		employeestreet.setBounds(0, 235, 146, 26);
		panel.add(employeestreet);
		employeestreet.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Street Name");
		lblNewLabel_2.setBounds(179, 238, 120, 20);
		panel.add(lblNewLabel_2);

		JButton btnSave_2 = new JButton("Add Employee");
		btnSave_2.setBounds(344, 232, 115, 29);
		panel.add(btnSave_2);
		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed1(ActionEvent e) {
				String name = employeename.getText();
				String age = (employeeage.getText());
				Integer age1 = Integer.valueOf(age);
				String city = employeecity.getText();
				String street = employeestreet.getText();
				String house = employeehouse.getText();
				String sal = employeesalary.getText();
				Integer salary = Integer.valueOf(sal);
				Address u = new Address(city, street, house);
				persons.add(new Employee(name, age1, u, salary));
				employees.add(new Employee(name, age1, u, salary));
			}

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("add student", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel studentname = new JLabel("Name");
		studentname.setBounds(216, 19, 41, 20);
		panel_1.add(studentname);

		studentName = new JTextField();
		studentName.setBounds(15, 16, 146, 26);
		panel_1.add(studentName);
		studentName.setColumns(10);

		final JLabel studentAge = new JLabel("Age");
		studentAge.setBounds(216, 55, 85, 20);
		panel_1.add(studentAge);

		studentage = new JTextField();
		studentage.setBounds(15, 52, 146, 26);
		panel_1.add(studentage);
		studentage.setColumns(10);

		studentgrade = new JTextField();
		studentgrade.setBounds(15, 94, 146, 26);
		panel_1.add(studentgrade);
		studentgrade.setColumns(10);

		JLabel studentGrade = new JLabel("Grade");
		studentGrade.setBounds(216, 91, 69, 20);
		panel_1.add(studentGrade);

		studentcity = new JTextField();
		studentcity.setBounds(15, 136, 146, 26);
		panel_1.add(studentcity);
		studentcity.setColumns(10);

		JLabel studentStreet = new JLabel("Street Name");
		studentStreet.setBounds(216, 225, 107, 20);
		panel_1.add(studentStreet);

		studenthouse = new JTextField();
		studenthouse.setBounds(15, 178, 146, 26);
		panel_1.add(studenthouse);
		studenthouse.setColumns(10);

		JLabel studentHouseNumber = new JLabel("House Number");
		studentHouseNumber.setBounds(216, 181, 107, 20);
		panel_1.add(studentHouseNumber);

		final JLabel studentCity = new JLabel("city");
		studentCity.setBounds(216, 142, 69, 20);
		panel_1.add(studentCity);

		studentstreet = new JTextField();
		studentstreet.setBounds(15, 222, 146, 26);
		panel_1.add(studentstreet);
		studentstreet.setColumns(10);

		JButton btnSave_1 = new JButton("Add Student");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = studentName.getText();
				Integer age = Integer.valueOf(studentage.getText());
				String city = studentcity.getText();
				String street = studentstreet.getText();
				String house = studenthouse.getText();
				String grade1 = (studentgrade.getText());
				Integer grade = Integer.valueOf(grade1);
				Address f = new Address(city, street, house);
				persons.add(new Student(name, age, f, grade));
				students.add(new Student(name, age, f, grade));
			}
		});
		btnSave_1.setBounds(359, 232, 115, 29);
		panel_1.add(btnSave_1);

		final JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Search", null, panel_2, null);
		panel_2.setLayout(null);
		final JLabel label_1 = new JLabel("Age");
		label_1.setBounds(10, 44, 85, 20);
		panel_2.add(label_1);
		final JLabel label = new JLabel("Name");
		label.setBounds(11, 11, 41, 20);
		panel_2.add(label);

		nametxt = new JTextField();
		nametxt.setBounds(71, 8, 146, 26);
		panel_2.add(nametxt);
		nametxt.setColumns(10);
		agetxt = new JTextField();
		agetxt.setBounds(71, 45, 146, 26);
		panel_2.add(agetxt);
		agetxt.setColumns(10);

		gstxt = new JTextField();
		gstxt.setBounds(71, 79, 146, 26);
		panel_2.add(gstxt);
		gstxt.setColumns(10);

		final JLabel label_2 = new JLabel("Grade");
		label_2.setBounds(11, 82, 69, 20);
		panel_2.add(label_2);

		citytxt = new JTextField();
		citytxt.setBounds(71, 119, 146, 26);
		panel_2.add(citytxt);
		citytxt.setColumns(10);

		final JLabel label_5 = new JLabel("city");
		label_5.setBounds(11, 119, 69, 20);
		panel_2.add(label_5);

		housetxt = new JTextField();
		housetxt.setBounds(71, 184, 146, 26);
		panel_2.add(housetxt);
		housetxt.setColumns(10);

		final JLabel label_4 = new JLabel("House Number");
		label_4.setBounds(0, 187, 107, 20);
		panel_2.add(label_4);

		final JLabel label_3 = new JLabel("Street Name");
		label_3.setBounds(0, 156, 107, 20);
		panel_2.add(label_3);

		streettxt = new JTextField();
		streettxt.setBounds(71, 156, 146, 26);
		panel_2.add(streettxt);
		streettxt.setColumns(10);

		label.setVisible(false);
		nametxt.setVisible(false);
		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		// saveUpdate.setVisible(false);
		agetxt.setVisible(false);
		gstxt.setVisible(false);
		citytxt.setVisible(false);
		housetxt.setVisible(false);
		streettxt.setVisible(false);
		final JRadioButton employeeCheck = new JRadioButton("employees");
		employeeCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JButton btnNext = new JButton("next");
				btnNext.setBounds(608, 423, 115, 29);
				panel_2.add(btnNext);
				btnNext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						ArrayList<Employee> matchingNames = new ArrayList<Employee>();
						for (Employee e1 : employees) {

							if ((name.getText()).equals(((Employee) e1).getName()))
								matchingNames.add(e1);

						}
						if (e.getSource() == btnNext) {

							write = new JTextArea();
							write.setBounds(277, 107, 427, 320);
							contentPane.add(write);
							write.setColumns(10);
							String h = matchingNames.get(i) + " ";
							write.setText(h);
							// System.out.println(matchingNames.get(i));
							btnNext.setEnabled(false);
							i++;

							if (i == matchingNames.size()) {
								btnNext.setEnabled(false);
								return;
							}
						}
						btnNext.setEnabled(true);

					}

				});

			}
		});
		employeeCheck.setBounds(11, 288, 155, 29);
		panel_2.add(employeeCheck);

		JRadioButton student = new JRadioButton("student");
		student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JButton btnNext = new JButton("next");
				btnNext.setBounds(608, 423, 115, 29);
				panel_2.add(btnNext);
				btnNext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						matchingStudents = new ArrayList<Student>();
						for (Student e1 : students) {
							if ((name.getText()).equals(((Student) e1).getName()))
								matchingStudents.add(e1);

						}
						if (e.getSource() == btnNext) {
                          y = i;
							write = new JTextArea();
							write.setBounds(277, 107, 427, 320);
							contentPane.add(write);
							write.setColumns(10);
							String h = matchingStudents.get(i) + " ";

							write.setText(h);

							btnNext.setEnabled(false);
                         i++;
						}

						final JButton update2 = new JButton("Update information");
						update2.setBounds(390, 360, 183, 23);
						panel_2.add(update2);

						update2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								final JButton saveUpdate = new JButton("Save The Update");
								saveUpdate.setBounds(81, 225, 127, 26);
								panel_2.add(saveUpdate);
								if (e.getSource() == update2) {

									label_2.setText("Grade");

									label.setVisible(true);
									nametxt.setVisible(true);
									label_1.setVisible(true);
									label_2.setVisible(true);
									label_3.setVisible(true);
									label_4.setVisible(true);
									label_5.setVisible(true);
									saveUpdate.setVisible(true);
									agetxt.setVisible(true);
									gstxt.setVisible(true);
									citytxt.setVisible(true);
									housetxt.setVisible(true);
									streettxt.setVisible(true);
								}

								saveUpdate.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										if (!nametxt.getText().equals("")) {
											matchingStudents.get(y).setName(nametxt.getText());
										}
										if (!agetxt.getText().equals("")) {
											matchingStudents.get(y).setAge(Integer.parseInt(agetxt.getText()));
										}

										if (!gstxt.getText().equals("")) {
											((Student) matchingStudents.get(y))
													.setGrade(Integer.parseInt(gstxt.getText()));
										}

										if (!citytxt.getText().equals("")) {
											matchingStudents.get(y).address.setCity(citytxt.getText());
										}
										if (!housetxt.getText().equals("")) {
											matchingStudents.get(y).address.setHouseNumber(housetxt.getText());
										}
										if (!streettxt.getText().equals("")) {
											matchingStudents.get(y).address.setStreetName(streettxt.getText());
										}

									}

								});
								

							}

						});
         
						if (i == matchingStudents.size()) {
							btnNext.setEnabled(false);
							return;
						}

						btnNext.setEnabled(true);
					}

				});

			}

		});

		student.setBounds(11, 320, 155, 29);
		panel_2.add(student);

		JRadioButton unl = new JRadioButton("keep it unlimited");
		unl.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				final JButton btnNext = new JButton("next");
				btnNext.setBounds(608, 423, 115, 29);
				panel_2.add(btnNext);

				btnNext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						ArrayList<Person> matchingNames = new ArrayList<Person>();
						for (Person e1 : persons) {

							if ((name.getText()).equals(((Person) e1).getName()))
								matchingNames.add(e1);

						}

						if (e.getSource() == btnNext) {

							write = new JTextArea();
							write.setBounds(277, 107, 427, 320);
							contentPane.add(write);
							write.setColumns(10);
							String h = matchingNames.get(i) + " ";
							write.setText(h);
							// System.out.println(matchingNames.get(i));
							btnNext.setEnabled(false);
							i++;

							if (i == matchingNames.size()) {
								btnNext.setEnabled(false);
								return;
							}
						}
						btnNext.setEnabled(true);

					}

				});

			}
		});

		unl.setBounds(11, 357, 155, 29);
		panel_2.add(unl);
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(327, 28, 69, 20);
		panel_2.add(lblName_1);

		name = new JTextField();
		name.setBounds(445, 25, 146, 26);
		panel_2.add(name);
		name.setColumns(10);

		final JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Report", null, panel_4, null);
		panel_4.setLayout(null);
		salarytxt = new JTextField();
		salarytxt.setBounds(13, 93, 146, 26);
		panel_4.add(salarytxt);
		salarytxt.setColumns(10);
		final JLabel salary = new JLabel("");
		salary.setBounds(164, 103, 69, 20);
		panel_4.add(salary);
		final JCheckBox employeeReport = new JCheckBox("Report Employees");
		employeeReport.addActionListener(new ActionListener() {

			public void actionPerformed1(ActionEvent e) {
				if (e.getSource() == employeeReport) {
					salary.setText("salary");

					String repo = salarytxt.getText();
					Double report = Double.valueOf(repo);
					final ArrayList<Employee> reportedEmployee = new ArrayList<Employee>();

					for (Employee h : employees) {
						if (h.getSalary() > report) {
							reportedEmployee.add(h);
						} // if
					} // for
					for (final Employee o : reportedEmployee) {
						final JButton next = new JButton("next");
						next.setBounds(528, 409, 115, 29);
						panel_4.add(next);
						next.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if (e.getSource() == next) {
									JTextField reportedtxt = new JTextField();
									reportedtxt.setBounds(444, 151, 400, 26);
									panel_4.add(reportedtxt);
									reportedtxt.setColumns(10);
									reportedtxt.setText("name is " + reportedEmployee.get(w).getName()
											+ " his / her salary " + reportedEmployee.get(w).getSalary());
									next.setEnabled(false);
									w++;

								}
								if (w == reportedEmployee.size()) {
									next.setEnabled(false);
									return;
								}
								next.setEnabled(true);
							}
						});

					} // for
				} // else if 1
			}

			public void actionPerformed(ActionEvent e) {

			}
		});
		employeeReport.setBounds(6, 11, 235, 23);
		panel_4.add(employeeReport);

		final JCheckBox studentReport = new JCheckBox("Report Students");
		studentReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == studentReport) {
					salary.setText("grade");
					String grade1 = salarytxt.getText();
					Double grade = Double.valueOf(grade1);
					final ArrayList<Student> reportedstuden = new ArrayList<Student>();

					for (Student h : students) {
						if (h.getGrade() > grade) {
							reportedstuden.add(h);
						} // if
					} // for
					for (final Student o : reportedstuden) {
						final JButton next = new JButton("next");
						next.setBounds(528, 409, 115, 29);
						panel_4.add(next);
						next.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if (e.getSource() == next) {
									JTextField reportedtxt = new JTextField();
									reportedtxt.setBounds(444, 151, 400, 26);

									panel_4.add(reportedtxt);
									reportedtxt.setColumns(10);
									reportedtxt.setText("name is " + reportedstuden.get(w).getName()
											+ " his / her grade " + reportedstuden.get(w).getGrade());
									next.setEnabled(false);
									w++;

								}
								if (w == reportedstuden.size()) {
									next.setEnabled(false);
									return;
								}
								next.setEnabled(true);
							}
						});

					} // for
				} // else if 1
			}

		});
		studentReport.setBounds(6, 37, 153, 23);
		panel_4.add(studentReport);
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		btnExit.setBounds(610, 504, 115, 45);
		contentPane.add(btnExit);
	}

	private void Updatebtn(ArrayList<Object> matchingNames, final int x) {
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ArrayList<Person> matchingNames = new ArrayList<Person>();
				final JButton saveUpdate = new JButton("Save The Update");
				boolean student = false;
				boolean employee = false;

				if (update.isEnabled()) {
					student = matchingNames.get(x) instanceof Student;
					employee = matchingNames.get(x) instanceof Employee;
					if (student) {
						label_2.setText("Grade");
					} else if (employee) {
						label_2.setText("Salary");
					}
					label.setVisible(true);
					nametxt.setVisible(true);
					label_1.setVisible(true);
					label_2.setVisible(true);
					label_3.setVisible(true);
					label_4.setVisible(true);
					label_5.setVisible(true);
					saveUpdate.setVisible(true);
					agetxt.setVisible(true);
					gstxt.setVisible(true);
					citytxt.setVisible(true);
					housetxt.setVisible(true);
					streettxt.setVisible(true);

					saveUpdate.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (!nametxt.getText().equals("")) {
								matchingNames.get(x).setName(nametxt.getText());
							}
							if (!agetxt.getText().equals("")) {
								matchingNames.get(x).setAge(Integer.parseInt(agetxt.getText()));
							}
							if (matchingNames.get(x) instanceof Employee) {
								if (!gstxt.getText().equals(""))
									((Employee) matchingNames.get(x)).setSalary(Integer.parseInt(gstxt.getText()));
							} else if (matchingNames.get(x) instanceof Student) {
								if (!gstxt.getText().equals("")) {
									((Student) matchingNames.get(x)).setGrade(Integer.parseInt(gstxt.getText()));
								}
							}

							if (!citytxt.getText().equals("")) {
								matchingNames.get(x).address.setCity(citytxt.getText());
							}
							if (!housetxt.getText().equals("")) {
								matchingNames.get(x).address.setHouseNumber(housetxt.getText());
							}
							if (!streettxt.getText().equals("")) {
								matchingNames.get(x).address.setStreetName(streettxt.getText());
							}

						}

					});

				}

				saveUpdate.setBounds(81, 225, 127, 26);
				panel_2.add(saveUpdate);
			}

		});
	}

	public void framee1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}