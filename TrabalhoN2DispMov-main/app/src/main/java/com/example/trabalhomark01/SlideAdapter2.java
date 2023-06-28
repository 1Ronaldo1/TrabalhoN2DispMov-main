package com.example.trabalhomark01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter2 extends PagerAdapter {

    //Objetos
    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter2(Context context){
        this.context = context;
    }

    //Arrays de cada posicao das imagens e salva os valores nessas posições
    public int [] slide_images = {
            R.drawable.cafe_da_manha,
            R.drawable.almoco,
            R.drawable.cafe_da_tarde,
            R.drawable.janta,
            R.drawable.agua,
    };

    //Arrays de cada posicao das Strings dos títulos e salva os valores nessas posições
    public int[] slide_headings = {
            R.string.title_cafe_manha,
            R.string.title_almoco,
            R.string.title_cafe_tarde,
            R.string.title_janta,
            R.string.title_agua
    };

    //Arrays de cada posicao das descrições e salva os valores nessas posições
    public int[] slide_descs = {
            R.string.text_dieta1,
            R.string.text_dieta2,
            R.string.text_dieta3,
            R.string.text_dieta4,
            R.string.text_dieta5
    };


    @Override
    //Conta o número
    public int getCount() {
        return slide_headings.length;
    }

    @Override

    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    //Método que adiciona o efeito dos slide em cada utilizando o LAYOUT INFLATER
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout2, container, false);

        //Inicia todos os IDs de imagem, descrição e icones
        ImageView slideImageView2 = (ImageView) view.findViewById(R.id.slide_image2);
        TextView slideHeading2 = (TextView) view.findViewById(R.id.slide_heading2);
        TextView slideDescription2 = (TextView) view.findViewById(R.id.slide_desc2);

        //Passa os Arrays com a posição que esta instanciada, cada vez q um slide passar ele vai
        //Selecionar a imagem de acordo com a posição da imagem
        slideImageView2.setImageResource(slide_images[position]);
        slideHeading2.setText(slide_headings[position]);
        slideDescription2.setText(slide_descs[position]);

        //Adiciona o container e a view desses slides
        container.addView(view);

        return view;
    }

    @Override
    //Método quando chegar a ultima pagina vai parar, e impedir que seja criada novos slides
    //impedindo erros
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //remove a view do objeto no RelativeLayout
        container.removeView((RelativeLayout) object);

    }
}
