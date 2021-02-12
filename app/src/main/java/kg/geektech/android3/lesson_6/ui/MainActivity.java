package kg.geektech.android3.lesson_6.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kg.geektech.android3.lesson_6.R;
import kg.geektech.android3.lesson_6.databinding.ActivityMainBinding;
import kg.geektech.android3.lesson_6.domain.Math;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.add(oper1, oper2)));
        });

        binding.btnMinus.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.minus(oper1, oper2)));
        });
        binding.btnMultiplication.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.multiplication(oper1, oper2)));
        });
        binding.btnDivision.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.division(oper1, oper2)));
        });
    }
    }

