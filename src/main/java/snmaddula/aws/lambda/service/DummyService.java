package snmaddula.aws.lambda.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import snmaddula.aws.lambda.domain.Alpha;
import snmaddula.aws.lambda.domain.Gamma;

/**
 * 
 * @author snmaddula
 *
 */
@Service
public class DummyService {

	public Gamma alphaToGamma(Alpha alpha) {
		Gamma gamma = new Gamma();
		gamma.setMessage("READ " + alpha.getMessage());
		gamma.setTime(Calendar.getInstance().getTime());
		return gamma;
	}
}
