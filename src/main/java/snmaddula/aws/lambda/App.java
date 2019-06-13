package snmaddula.aws.lambda;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.context.annotation.Bean;

import snmaddula.aws.lambda.domain.Alpha;
import snmaddula.aws.lambda.domain.Gamma;
import snmaddula.aws.lambda.service.DummyService;

/**
 * 
 * @author snmaddula
 *
 */
@SpringBootApplication
public class App extends SpringBootRequestHandler<Alpha, Gamma> {

	@Bean
	public Function<Alpha, Gamma> alpha2gamma(DummyService service) {
		return (alpha) -> service.alphaToGamma(alpha);
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
