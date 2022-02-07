package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Solve2 extends Thread {
	boolean cookieAccepted;
	private String url1, url2, url3, url4;
	private boolean AA, Aa, AN, aA, aa, aN, NA, Na, NN;
	private WebDriver driver;
	private WebDriverWait wait;

	public Solve2(String url1, String url2, String url3, String url4, boolean AA, boolean Aa, boolean AN, boolean aA,
			boolean aa, boolean aN, boolean NA, boolean Na, boolean NN) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		cookieAccepted = false;
		this.url1 = url1;
		this.url2 = url2;
		this.url3 = url3;
		this.url4 = url4;
		this.AA = AA;
		this.Aa = Aa;
		this.AN = AN;
		this.aA = aA;
		this.aa = aa;
		this.aN = aN;
		this.NA = NA;
		this.Na = Na;
		this.NN = NN;
		wait = new WebDriverWait(driver, 300);
	}

	public void run() {
		driver.get(url1);
		if (AA || Aa || AN) {
			outerloop: for (char chA = 'G'; chA <= 'K'; chA++) {
				if (Aa) {
					for (char cha = 'a'; cha <= 'z'; cha++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + Character.toString(cha) + ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted = true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + Character.toString(cha) + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + Character.toString(chA) + Character.toString(cha));
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
				if (AA) {
					for (char cha = 'A'; cha <= 'Z'; cha++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + Character.toString(cha) + ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted = true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + Character.toString(cha) + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + Character.toString(chA) + Character.toString(cha));
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
				if (AN) {
					for (int i = 0; i <= 9; i++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + i + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + i + ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted = true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + i + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + i + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + Character.toString(chA) + i);
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
			}
		}
		if (aA || aa || aN) {
			outerloop: for (char chA = 'g'; chA <= 'k'; chA++) {
				if (aa) {
					for (char cha = 'a'; cha <= 'z'; cha++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA+ Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + Character.toString(cha) + ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted=true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + Character.toString(cha) + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + Character.toString(chA) + Character.toString(cha));
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
				if (aA) {
					for (char cha = 'A'; cha <= 'Z'; cha++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA+ Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + Character.toString(cha) + ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted=true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + Character.toString(cha) + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + Character.toString(chA) + Character.toString(cha));
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
				if (aN) {
					for (int i = 0; i <= 9; i++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA+ i+ url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + i+ ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted=true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + Character.toString(chA) + i + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(Character.toString(chA) + i + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + Character.toString(chA) + i);
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
			}
		}
		if (NA || Na || NN) {
			outerloop: for (int chA = 2; chA <= 3; chA++) {
				if (Na) {
					for (char cha = 'a'; cha <= 'z'; cha++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA+ Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + Character.toString(cha) + ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted=true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + Character.toString(cha) + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + chA + Character.toString(cha));
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
				if (NA) {
					for (char cha = 'A'; cha <= 'Z'; cha++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA+ Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + Character.toString(cha) + ",");
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted=true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA + Character.toString(cha) + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + Character.toString(cha) + ",");
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + chA + Character.toString(cha));
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
				if (NN) {
					for (int i = 0; i <= 9; i++) {
						if (Main.getFound() == false) {

							try {
								if (!cookieAccepted) {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA +  i+ url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA + ( i+ ","));
									wait.until(ExpectedConditions.visibilityOfElementLocated(
											By.xpath("//*[@id=\"bodyel\"]/section[1]/div[4]/div[1]/div[2]/button[1]")))
											.click();
									cookieAccepted = true;
								} else {
									WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By
											.xpath("//*[@id=\"bodyel\"]/section[4]/div[10]/section/div/div[2]/div/input")));
									input.clear();
									input.sendKeys(url2 + chA + i + url3);
									driver.findElement(
											By.xpath(("//*[@id=\"bodyel\"]/section[4]/div[10]/footer/div/button")))
											.click();
									System.out.print(chA +( i+ ","));
								}
							} catch (Exception e) {
								System.out.println("");
								System.out.println("Y: " + chA + i);
								Main.setFound(true);
								break outerloop;
							}
						} else {
							break outerloop;
						}
					}
				}
			}
		}
		driver.quit();
	}
}
