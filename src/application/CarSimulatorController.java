package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class CarSimulatorController {

	@FXML
	private ImageView imageView;
	
	@FXML
	private Button right;
	@FXML
	private Button left;
	@FXML
	private Button go;
	@FXML
	private Button back;
	
	private int x = 30;
	private int y = 30;
	
	public CarSimulatorController() {
		// TODO Auto-generated constructor stub
	}
	
	@FXML
	public void initialize() {
		imageView.setDisable(false);
		imageView.setLayoutX(x);
		imageView.setLayoutY(y);	
	
	}

	// Setting the position of the image
	@FXML
	public void TurnRight() {
		imageView.setRotate(imageView.getRotate() + 90);
		System.out.println(imageView.getRotate());
		
	}
	
	@FXML
	public void TurnLeft() {
		imageView.setRotate(imageView.getRotate() - 90);
		System.out.println(imageView.getRotate());
	}
	
	@FXML
	public void GoStraight() {
		
		if(rotate() == 0 || Math.abs(rotate()) == 360) {
			x = x+1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
		} else if (rotate() == 90 || rotate() == 450) {
			y = y+1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
		} else if (rotate() == -90.0 || rotate() == -450) {
			y = y-1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
			System.out.println(imageView.getLayoutX());
			System.out.println(imageView.getLayoutY());
		} else if (Math.abs(rotate()) == 180 || Math.abs(rotate()) == 540) {
			x = x-1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
		} else if (rotate() == 270 || rotate() == 630) {
			y = y-1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);		
		} else if (rotate() == -270 || rotate() == -630) {
			y = y+1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);		
		}
	}
	
	@FXML
	public void Back() {
		if(rotate() == 0 || Math.abs(rotate()) == 360) {
			x = x-1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
		} else if (rotate() == 90 || rotate() == 450) {
			y = y-1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
		} else if (rotate() == -90.0 || rotate() == -450) {
			y = y+1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
			System.out.println(imageView.getLayoutX());
			System.out.println(imageView.getLayoutY());
		} else if (Math.abs(rotate()) == 180 || Math.abs(rotate()) == 540) {
			x = x+1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);	
		} else if (rotate() == 270 || rotate() == 630) {
			y = y-1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);		
		} else if (rotate() == -270 || rotate() == -630) {
			y = y+1;
			imageView.setLayoutX(x);
			imageView.setLayoutY(y);		
		}
	}
	
	public double rotate() {
		return imageView.getRotate();
	}
	
	//
	// setting the fit height and width of the image view
	// imageView.setFitHeight(300);
	// imageView.setFitWidth(250);
	//
	// Setting the preserve ratio of the image view
	// imageView.setPreserveRatio(true);

	// Creating a Group object
	// Group root = new Group(imageView);
	

}
