package TodoBoard;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BoardService s = new BoardService();
		ArrayList<Board> list = s.showAllTodo();
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/main.jsp").forward(req, resp);
	}
	
	
}
