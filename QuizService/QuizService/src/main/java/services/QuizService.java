package services;
import com.quiz.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuizService {
Quiz add(Quiz quiz);
List<Quiz> get();
Quiz get(Long id);

}
