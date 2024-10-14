package com.kaminbohnet.chesstimerappintheclonedgithubrepository

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.kaminbohnet.chesstimerappintheclonedgithubrepository.databinding.TimerFragmentBinding

class TimerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: TimerFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.timer_fragment, container, false)
        return binding.root
    }
}