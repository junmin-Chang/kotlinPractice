import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_fragment.*
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment() {

    interface onDataPassListener {
        fun onDataPass(data : String?)
    }

    lateinit var dataPassListener : onDataPassListener

    override fun onAttach(context: Context) {
        Log.d("Life_Cycle", "F onAttach")
        super.onAttach(context)
        dataPassListener = context as onDataPassListener

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Life_Cycle", "F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Life_Cycle", "F onCreateView")

        // fragment가 인터페이스를 처음으로 그릴때 호출된다.
        // Inflator -> 뷰를 그려주는 역할
        // container -> 부모뷰
        return inflater.inflate(R.layout.fragment_one, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Life_Cycle", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)


        // Activity의 Oncreate 에서 했던 작업을 여기에서 한다
        pass.setOnClickListener {
            dataPassListener.onDataPass("Good bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Life_Cycle", "F onActivityCreated")
        val data = arguments?.getString("hello")


        Log.d("data", ""+ data)
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("Life_Cycle", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Life_Cycle", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Life_Cycle", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Life_Cycle", "F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Life_Cycle", "F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("Life_Cycle", "F onDetach")
        super.onDetach()
    }
}

