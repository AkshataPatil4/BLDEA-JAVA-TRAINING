package com.bldea.crorepathiApp.package1;
import java.util.Scanner;
public class questions {
 static String result;
 static String result2;
 static int count_life_line=3;
 static  int aud_phn=1;
 static int cnt_50_50=1;
 static int skip_cnt=1;
static Scanner sc = new Scanner(System.in);
public static boolean fetchquestions1(String name) throws Exception {
	System.out.println("1. Who is the founder of Java?");
	System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
			+ "e) life line");
	result = sc.next();
	if (result.equalsIgnoreCase("d")) {
		candidate.setAmount(1000);
		return true;
	} 
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(1000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(1000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println(
											"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(1000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println(
											"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(1000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(1000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println(
											"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(1000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println(
											"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(1000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println(
											"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								
								candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println(
											"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println(
					"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				candidate.setAmount(1000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchquestions2(String name) throws Exception{
	System.out.println("2. Who is the captain of RCB?");
	System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n"
			+ "e) help line");
	result = sc.next();
	if (result.equalsIgnoreCase("c")) {
		candidate.setAmount(2000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(2000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(2000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("2")) {
										candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(2000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(2000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(2000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(2000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(2000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) Maxwell\n" + "c) Faf duplesis\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				candidate.setAmount(2000);
				return true;
			}
		}

	}


	return false;
}


public static boolean fetchquestions3(String name) throws Exception {
	System.out.println("3. Who is the current cheif minister of india?");
	System.out.println("a) Yeddurappa\n"+
	                   "b) Basavaraj Bommai\n"+
			           "c) Rahul Gandhi\n"+
	                   "d) Sidaramaya\n"+
			           "e)life line");
	result = sc.next();
	if(result.equalsIgnoreCase("b")) {
		candidate.setAmount(10000);
	return true;
}
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 95%\n" + "option c = 3%\n" + "option d = 2%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Yeddurappa\n"+
						                   "b) Basavaraj Bommai\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")){
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n"+
										           "c) Rahul Gandhi\n"+
								                   "d) Sidaramaya\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n"+
										           "c) Rahul Gandhi\n"+
								                   "d) Sidaramaya");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Yeddurappa\n"+
				                   "b) Basavaraj Bommai\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 95%\n" + "option c = 3%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n"+
										           "c) Rahul Gandhi\n"+
								                   "d) Sidaramaya");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 95%\n" + "option c = 3%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n"+
										           "c) Rahul Gandhi\n"+
								                   "d) Sidaramaya\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(10000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 95%\n" + "option c = 3%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n"+
										           "c) Rahul Gandhi\n"+
								                   "d) Sidaramaya");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Yeddurappa\n"+
						                   "b) Basavaraj Bommai\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 95%\n" + "option c = 3%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Yeddurappa\n"+
								                   "b) Basavaraj Bommai\n"+
										           "c) Rahul Gandhi\n"+
								                   "d) Sidaramaya");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Yeddurappa\n"+
		                   "b) Basavaraj Bommai\n"+
				           "c) Rahul Gandhi\n"+
		                   "d) Sidaramaya");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					candidate.setAmount(10000);
					return true;
				}
			}

		}


	return false;
}
public static boolean fetchquestions4(String name) throws Exception{
	System.out.println("4. Who is the prime minister of india?");
	System.out.println("a) Narendra Modi\n"+
	                   "b) Rajiv Gandhi\n"+
			           "c) Rahul Gandhi\n"+
	                   "d) Mahatma Gandhi\n"+
			           "e) life line");
	result = sc.next();
	if(result.equalsIgnoreCase("a")) {
		candidate.setAmount(20000);
	return true;
}
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Narendra Modi\n" + "c) Rahul Gandhi");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Narendra Modi\n"+
								                   "b) Rajiv Gandhi\n"+
										           "c) Rahul Gandhi\n"+
								                   "d) Mahatma Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Narendra Modi\n" + "c) Rahul Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Narendra Modi\n"+
														"b) Rajiv Gandhi\n"+
														"c) Rahul Gandhi\n"+
														"d) Mahatma Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Narendra Modi\n" + "c) Rahul Gandhi");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Narendra Modi\n"+
												"b) Rajiv Gandhi\n"+
												"c) Rahul Gandhi\n"+
												"d) Mahatma Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Narendra Modi\n"+
												"b) Rajiv Gandhi\n"+
												"c) Rahul Gandhi\n"+
												"d) Mahatma Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(20000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Narendra Modi\n" + "c) Rahul Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Narendra Modi\n"+
												"b) Rajiv Gandhi\n"+
												"c) Rahul Gandhi\n"+
												"d) Mahatma Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Narendra Modi\n" + "c) Rahul Gandhi");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Narendra Modi\n"+
												"b) Rajiv Gandhi\n"+
												"c) Rahul Gandhi\n"+
												"d) Mahatma Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Narendra Modi\n"+
						"b) Rajiv Gandhi\n"+
						"c) Rahul Gandhi\n"+
						"d) Mahatma Gandhi");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					candidate.setAmount(20000);
					return true;
				}
			}

		}

	return false;
}
public static boolean fetchquestions5(String name) throws Exception{
	System.out.println("5. Who is the founder of computer?");
	System.out.println("a) James Gossling\n"+
	                   "b) Dennis ritche\n"+
			           "c) Charles Babbage\n"+
	                   "d) Mahatma Gandhi\n"+
			           "e) life line");
	result = sc.next();
	if(result.equalsIgnoreCase("c")) {
		candidate.setAmount(150000);
	return true;
}
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(150000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) James Gossling\n"+"c) Charles Babbage");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(150000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(150000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) James Gossling\n"+
											"b) Dennis ritche\n"+
											"c) Charles Babbage\n"+
											"d) Mahatma Gandhi");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(150000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) James Gossling\n"+"c) Charles Babbage");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) James Gossling\n"+
											"b) Dennis ritche\n"+
											"c) Charles Babbage\n"+
											"d) Mahatma Gandhi");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) James Gossling\n"+"c) Charles Babbage");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(150000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(150000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(150000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) James Gossling\n"+
											"b) Dennis ritche\n"+
											"c) Charles Babbage\n"+
											"d) Mahatma Gandhi");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(150000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) James Gossling\n"+
											"b) Dennis ritche\n"+
											"c) Charles Babbage\n"+
											"d) Mahatma Gandhi");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(150000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(150000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) James Gossling\n"+"c) Charles Babbage\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) James Gossling\n"+
											"b) Dennis ritche\n"+
											"c) Charles Babbage\n"+
											"d) Mahatma Gandhi");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) James Gossling\n"+"c) Charles Babbage\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(150000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) James Gossling\n"+
											"b) Dennis ritche\n"+
											"c) Charles Babbage\n"+
											"d) Mahatma Gandhi");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(150000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) James Gossling\n"+
					"b) Dennis ritche\n"+
					"c) Charles Babbage\n"+
					"d) Mahatma Gandhi");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				candidate.setAmount(150000);
				return true;
		}
	}
}
	return false;
}
public static boolean fetchquestions6(String name) throws Exception {
	System.out.println("6. Which is the national fruit?");
	System.out.println("a) Mango\n"+
	                   "b) Papaya\n"+
			           "c) Orange\n"+
	                   "d) Pineapple\n"+
			           "e)life line");
	result = sc.next();
	if(result.equalsIgnoreCase("a")) {
		candidate.setAmount(300000);
	return true;
}
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(300000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Mango\n"+"c) Orange");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(300000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("a")) {
								if(skip_cnt!=0) {
									candidate.setAmount(300000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Mango\n"+
											"b) Papaya\n"+
											"c) Orange\n"+
											"d) Pineapple");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(300000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Mango\n"+"c) Orange");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Mango\n"+
											"b) Papaya\n"+
											"c) Orange\n"+
											"d) Pineapple");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) Mango\n"+"c) Orange");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(300000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(300000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(300000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Mango\n"+
											"b) Papaya\n"+
											"c) Orange\n"+
											"d) Pineapple");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(300000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Mango\n"+
											"b) Papaya\n"+
											"c) Orange\n"+
											"d) Pineapple");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(300000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(300000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Mango\n"+"c) Orange");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Mango\n"+
											"b) Papaya\n"+
											"c) Orange\n"+
											"d) Pineapple");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Mango\n"+"c) Orange");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(300000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Mango\n"+
											"b) Papaya\n"+
											"c) Orange\n"+
											"d) Pineapple");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Mango\n"+
					"b) Papaya\n"+
					"c) Orange\n"+
					"d) Pineapple");
result = sc.next();
if(result.equalsIgnoreCase("a")) {
	candidate.setAmount(300000);
	return true;
		}
	}
}
	
	return false;
}
public static boolean fetchquestions7(String name) throws Exception {
	System.out.println("7. Which is the national bird?");
	System.out.println("a) Parrot\n"+
	                   "b) Sparrow\n"+
			           "c) Peacock\n"+
	                   "d) Owl");
	result = sc.next();
	if(result.equalsIgnoreCase("c")) {
		candidate.setAmount(400000);
	return true;
}
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(400000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Parrot\n"+"c) Peacock");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(400000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(400000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Parrot\n"+
											"b) Sparrow\n"+
											"c) Peacock\n"+
											"d) Owl");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(400000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Parrot\n"+"c) Peacock");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Parrot\n"+
											"b) Sparrow\n"+
											"c) Peacock\n"+
											"d) Owl");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) Parrot\n"+"c) Peacock");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(400000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(400000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(400000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Parrot\n"+
											"b) Sparrow\n"+
											"c) Peacock\n"+
											"d) Owl");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(400000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Parrot\n"+
											"b) Sparrow\n"+
											"c) Peacock\n"+
											"d) Owl");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(400000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(400000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Parrot\n"+"c) Peacock");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Parrot\n"+
							                   "b) Sparrow\n"+
									           "c) Peacock\n"+
							                   "d) Owl");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Parrot\n"+"c) Peacock");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(400000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 7%\n" + "option b = 2%\n" + "option c = 91%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Parrot\n"+
							                   "b) Sparrow\n"+
									           "c) Peacock\n"+
							                   "d) Owl");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(400000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
	else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Parrot\n"+
	                   "b) Sparrow\n"+
			           "c) Peacock\n"+
	                   "d) Owl");

result = sc.next();
if(result.equalsIgnoreCase("c")) {
	candidate.setAmount(400000);
	return true;
		}
	}
}
	
	return false;
}
public static boolean fetchquestions8(String name)throws Exception {
	System.out.println("8. Which is the national animal?");
	System.out.println("a) Lion\n"+
	                   "b) Cow\n"+
			           "c) Elephant\n"+
	                   "d) Tiger\n"+
			           "e)life line");
	result = sc.next();
	if(result.equalsIgnoreCase("d")) {
		candidate.setAmount(1000000);
	return true;
}
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(1000000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Lion\n"+"d) Tiger");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(1000000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Lion\n"+
											"b) Cow\n"+
											"c) Elephant\n"+
											"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(1000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Lion\n"+"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Lion\n"+
											"b) Cow\n"+
											"c) Elephant\n"+
											"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) Lion\n"+"d) Tiger");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(1000000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(1000000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Lion\n"+
											"b) Cow\n"+
											"c) Elephant\n"+
											"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(1000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Lion\n"+
											"b) Cow\n"+
											"c) Elephant\n"+
											"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(1000000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Lion\n"+"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Lion\n"+
											"b) Cow\n"+
											"c) Elephant\n"+
											"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Lion\n"+"d) Tiger");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								
								candidate.setAmount(1000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Lion\n"+
											"b) Cow\n"+
											"c) Elephant\n"+
											"d) Tiger");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Lion\n"+
					"b) Cow\n"+
					"c) Elephant\n"+
					"d) Tiger");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				candidate.setAmount(1000000);
				return true;
			}
		}

	}
	return false;
}
public static boolean fetchquestions9(String name) throws Exception {
	System.out.println("9. Which is the natonal game?");
	System.out.println("a) Cricket\n"+
	                   "b) Badminton\n"+
			           "c) Basketball\n"+
	                   "d) Hockey\n"+
			           "e) life line");
	result = sc.next();
	if(result.equalsIgnoreCase("d")) {
		candidate.setAmount(5000000);
	return true;
}
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(5000000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Lion\n"+"d) Tiger");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(5000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(5000000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Cricket\n"+
											"b) Badminton\n"+
											"c) Basketball\n"+
											"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(5000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Cricket\n"+"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Cricket\n"+
											"b) Badminton\n"+
											"c) Basketball\n"+
											"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) Cricket\n"+"d) Hockey");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(5000000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(5000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(5000000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Cricket\n"+
											"b) Badminton\n"+
											"c) Basketball\n"+
											"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(5000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Cricket\n"+
											"b) Badminton\n"+
											"c) Basketball\n"+
											"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(5000000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(5000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Cricket\n"+"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Cricket\n"+
											"b) Badminton\n"+
											"c) Basketball\n"+
											"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Cricket\n"+"d) Hockey");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								
								candidate.setAmount(5000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Cricket\n"+
											"b) Badminton\n"+
											"c) Basketball\n"+
											"d) Hockey");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(5000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Cricket\n"+
					"b) Badminton\n"+
					"c) Basketball\n"+
					"d) Hockey");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				candidate.setAmount(5000000);
				return true;
			}
		}

	}
	return false;
}
public static boolean fetchquestions10(String name) throws Exception {
	System.out.println("10. Who wrote natonal anthem?");
	System.out.println("a) Rabindranath tagore\n"+
	                   "b) Kuvempu\n"+
			           "c) Ranna\n"+
	                   "d) Pampa\n"+
			           "e) life line");
	result = sc.next();
	if(result.equalsIgnoreCase("a")) {
		candidate.setAmount(10000000);
	return true;
}
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(10000000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Rabindranath tagore\n"+"b) Kuvempu");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("a")) {
								if(skip_cnt!=0) {
									candidate.setAmount(300000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu\n"+
											"c) Ranna\n"+
											"d) Pampa");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(10000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(300000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu\n"+
											"c) Ranna\n"+
											"d) Pampa");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) Rabindranath tagore\n"+
							"b) Kuvempu\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(10000000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(10000000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu\n"+
											"c) Ranna\n"+
											"d) Pampa");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(10000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu\n"+
											"c) Ranna\n"+
											"d) Pampa");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(10000000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu\n"+
											"c) Ranna\n"+
											"d) Pampa");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Rabindranath tagore\n"+
									"b) Kuvempu");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 97%\n" + "option b = 0%\n" + "option c = 3%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Rabindranath tagore\n"+
											"b) Kuvempu\n"+
											"c) Ranna\n"+
											"d) Pampa");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Rabindranath tagore\n"+
					"b) Kuvempu\n"+
					"c) Ranna\n"+
					"d) Pampa");
result = sc.next();
if(result.equalsIgnoreCase("a")) {
	candidate.setAmount(10000000);
	return true;
		}
	}
}
	return false;
}

}

