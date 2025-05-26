const allVideos = [
    {
        title: "Altura",
        link: "https://www.youtube.com/watch?v=OdUxIkLQJ_I",
        category: "cumprimentos"
    },
    {
        title: "Boa Noite",
        link: "https://www.youtube.com/watch?v=t-tSBYbasA8",
        category: "cumprimentos"
    },
    {
        title: "Boa Tarde",
        link: "https://www.youtube.com/watch?v=XxpspxWUeWI",
        category: "cumprimentos"
    },
    {
        title: "Bom Dia",
        link: "https://www.youtube.com/watch?v=hzEMKmxmsMU",
        category: "cumprimentos"
    },
    {
        title: "Com Licença - Por Favor",
        link: "https://www.youtube.com/watch?v=sE9hcDDzSQM",
        category: "cumprimentos"
    },
    {
        title: "Conhecer",
        link: "https://www.youtube.com/watch?v=uiJQDIEfnZ0",
        category: "cumprimentos"
    },
    {
        title: "Cumprimento",
        link: "https://www.youtube.com/watch?v=R6ieruhhia8",
        category: "cumprimentos"
    },
    {
        title: "De Nada",
        link: "https://www.youtube.com/watch?v=0npVuMFN0yw",
        category: "cumprimentos"
    },
    {
        title: "Desculpe",
        link: "https://www.youtube.com/watch?v=FVqD0yqnNCg",
        category: "cumprimentos"
    },
    {
        title: "idade",
        link: "https://www.youtube.com/watch?v=n6L_rxdeHus",
        category: "cumprimentos"
    },
    {
        title: "Apontador",
        link: "https://www.youtube.com/watch?v=rVuEQcoL5Bk",
        category: "escola"
    },
    {
        title: "Artes",
        link: "https://www.youtube.com/watch?v=0zEdHDObskg",
        category: "escola"
    },
    {
        title: "Banheiro dos Professores",
        link: "https://www.youtube.com/watch?v=7JN4Fe1jG2Y",
        category: "escola"
    },
    {
        title: "Banheiro Feminino",
        link: "https://www.youtube.com/watch?v=f4Tn3hOFktM",
        category: "escola"
    },
    {
        title: "Banheiro Masculino",
        link: "https://www.youtube.com/watch?v=wzqf5-SHkFk",
        category: "escola"
    },
    {
        title: "Ela",
        link: "https://www.youtube.com/watch?v=SxUlwKVwmtQ",
        category: "pronomes"
    },
    {
        title: "Ele",
        link: "https://www.youtube.com/watch?v=qKKupz1raSg",
        category: "pronomes"
    },
    {
        title: "Eu",
        link: "https://www.youtube.com/watch?v=eMrt0JHFULU",
        category: "pronomes"
    },
    {
        title: "Nós",
        link: "https://www.youtube.com/watch?v=vk_uXzKa8sk",
        category: "pronomes"
    },
    {
        title: "Pronomes",
        link: "https://www.youtube.com/watch?v=RsDQ4l26_s8",
        category: "pronomes"
    },
    {
        title: "Seu",
        link: "https://www.youtube.com/watch?v=jojC0Cb63f4",
        category: "pronomes"
    },
    {
        title: "Teu",
        link: "https://www.youtube.com/watch?v=Hec1tbR3OWI",
        category: "pronomes"
    },
    {
        title: "Você",
        link: "https://www.youtube.com/watch?v=lr4DEXVyEsk",
        category: "pronomes"
    },
    {
        title: "Computador",
        link: "https://www.youtube.com/watch?v=8fsSsQ-bzUI",
        category: "escola"
    },
    {
        title: "Cozinha",
        link: "https://www.youtube.com/watch?v=k4M6pBefuLE",
        category: "escola"
    },
    {
        title: "Depósito",
        link: "https://www.youtube.com/watch?v=sb_5t51fLn0",
        category: "escola"
    },
    {
        title: "Diretor",
        link: "https://www.youtube.com/watch?v=Hz5Kce4dl2c",
        category: "escola"
    },
    {
        title: "Disciplina Escolar",
        link: "https://www.youtube.com/watch?v=YsaatNGHfXs",
        category: "escola"
    },
    {
        title: "Educação Física",
        link: "https://www.youtube.com/watch?v=TtR3Txx_bKE",
        category: "escola"
    },
    {
        title: "Empreendedorismo",
        link: "https://www.youtube.com/watch?v=AdysPFPqETY",
        category: "escola"
    },
    {
        title: "Escola",
        link: "https://www.youtube.com/watch?v=avWrNjweHmg",
        category: "escola"
    },
    {
        title: "Estojo",
        link: "https://www.youtube.com/watch?v=klXx0jtqpiE",
        category: "escola"
    },
    {
        title: "Filosofia",
        link: "https://www.youtube.com/watch?v=0SFaY_ck5B8",
        category: "escola"
    },
    {
        title: "Física",
        link: "https://www.youtube.com/watch?v=Fy3T1VWgs88",
        category: "escola"
    },
    {
        title: "Fita Adesiva",
        link: "https://www.youtube.com/watch?v=LgwN8uPiyXc",
        category: "escola"
    },
    {
        title: "Formatura",
        link: "https://www.youtube.com/watch?v=XvBQti_fAss",
        category: "escola"
    },
    {
        title: "Geografia",
        link: "https://www.youtube.com/watch?v=dbOfV1MsQbY",
        category: "escola"
    },
    {
        title: "História",
        link: "https://www.youtube.com/watch?v=D7jC2xBAJz4",
        category: "escola"
    },
    {
        title: "Inglês",
        link: "https://www.youtube.com/watch?v=1F9igoR6IM4",
        category: "escola"
    },
    {
        title: "Lápis de Cor",
        link: "https://www.youtube.com/watch?v=bZU4ykQJJMM",
        category: "escola"
    },
    {
        title: "Lápis",
        link: "https://www.youtube.com/watch?v=T5pU_fWhr_k",
        category: "escola"
    },
    {
        title: "Lapiseira",
        link: "https://www.youtube.com/watch?v=urjEGEVfmTY",
        category: "escola"
    },
    {
        title: "Livro",
        link: "https://www.youtube.com/watch?v=NfBWCrw7XqQ",
        category: "escola"
    },
    {
        title: "Matemática",
        link: "https://www.youtube.com/watch?v=hXX2Qz7TAxo",
        category: "escola"
    },
    {
        title: "Mochila",
        link: "https://www.youtube.com/watch?v=GHlHxvV_oWw",
        category: "escola"
    },
    {
        title: "Papel",
        link: "https://www.youtube.com/watch?v=ZmwadgBHS5o",
        category: "escola"
    },
    {
        title: "Parque",
        link: "https://www.youtube.com/watch?v=K4Sr_s_SbCk",
        category: "escola"
    },
    {
        title: "Pasta",
        link: "https://www.youtube.com/watch?v=pfFjXBn9Xmc",
        category: "escola"
    },
    {
        title: "Pátio",
        link: "https://www.youtube.com/watch?v=WSqUhvodA8c",
        category: "escola"
    },
    {
        title: "Português",
        link: "https://www.youtube.com/watch?v=ATMWpm_laf4",
        category: "escola"
    },
    {
        title: "Produção Textual",
        link: "https://www.youtube.com/watch?v=cOOcG_ANI5M",
        category: "escola"
    },
    {
        title: "Química",
        link: "https://www.youtube.com/watch?v=L7vhug8vCcQ",
        category: "escola"
    },
    {
        title: "Régua",
        link: "https://www.youtube.com/watch?v=wNUapltPKTs",
        category: "escola"
    },
    {
        title: "Revista",
        link: "https://www.youtube.com/watch?v=nYCa6Qs0HYs",
        category: "escola"
    },
    {
        title: "Robótica",
        link: "https://www.youtube.com/watch?v=FN1atXGC3B4",
        category: "escola"
    },
    {
        title: "Sala ambiente",
        link: "https://www.youtube.com/watch?v=nSwmhZheFWE",
        category: "escola"
    },
    {
        title: "Sala de Aula",
        link: "https://www.youtube.com/watch?v=WiqVYesc5zs",
        category: "escola"
    },
    {
        title: "Sala de Informática",
        link: "https://www.youtube.com/watch?v=q11M0SpzLjs",
        category: "escola"
    },
    {
        title: "Sala de Vídeo",
        link: "https://www.youtube.com/watch?v=2uWKyYNB-Yo",
        category: "escola"
    },
    {
        title: "Sala dos Professores",
        link: "https://www.youtube.com/watch?v=T1rzDRrTY9o",
        category: "escola"
    },
    {
        title: "Meu Nome Completo",
        link: "https://www.youtube.com/watch?v=LofwNFZdtAo",
        category: "cumprimentos"
    },
    {
        title: "Meu Nome",
        link: "https://www.youtube.com/watch?v=A-GwbcrhH60",
        category: "cumprimentos"
    },
    {
        title: "Meu sinal",
        link: "https://www.youtube.com/watch?v=ELh53HlYc14",
        category: "cumprimentos"
    },
    {
        title: "Obrigado",
        link: "https://www.youtube.com/watch?v=ssR7WvzF6aY",
        category: "cumprimentos"
    },
    {
        title: "Oi",
        link: "https://www.youtube.com/watch?v=KPNGy6JyLJ8",
        category: "cumprimentos"
    },
    {
        title: "Peso",
        link: "https://www.youtube.com/watch?v=2U3s5eEFONk",
        category: "cumprimentos"
    },
    {
        title: "Prazer em conhecer",
        link: "https://www.youtube.com/watch?v=oc1wYwhusHA",
        category: "cumprimentos"
    },
    {
        title: "Saudades",
        link: "https://www.youtube.com/watch?v=j-dFV4ldppE",
        category: "cumprimentos"
    },
    {
        title: "Secretaria",
        link: "https://www.youtube.com/watch?v=TDO-vkrMTks",
        category: "escola"
    },
    {
        title: "Seu nome",
        link: "https://www.youtube.com/watch?v=K0pWMFHLRHc",
        category: "cumprimentos"
    },
    {
        title: "Sociologia",
        link: "https://www.youtube.com/watch?v=pCraAiq9n-Y",
        category: "escola"
    },
    {
        title: "Tchau",
        link: "https://www.youtube.com/watch?v=3yfOIysAudg",
        category: "cumprimentos"
    },
    {
        title: "Tesouras",
        link: "https://www.youtube.com/watch?v=52FQ01ZvBZk",
        category: "escola"
    },
    {
        title: "Tudo bem",
        link: "https://www.youtube.com/watch?v=npaJzMpD9Eg",
        category: "cumprimentos"
    },
    {
        title: "Banheiro",
        link: "https://www.youtube.com/watch?v=QIpZQdr5iBM",
        category: "escola"
    },
    {
        title: "Biblioteca",
        link: "https://www.youtube.com/watch?v=XNHKDrT3VaE",
        category: "escola"
    },
    {
        title: "Borracha",
        link: "https://www.youtube.com/watch?v=H2Emw3jjN4M",
        category: "escola"
    },
    {
        title: "Caderno",
        link: "https://www.youtube.com/watch?v=J-DAUPP1sxs",
        category: "escola"
    },
    {
        title: "Caneta",
        link: "https://www.youtube.com/watch?v=qpBFlV78ZXw",
        category: "escola"
    },
    {
        title: "Cesta de lixo",
        link: "https://www.youtube.com/watch?v=FqmOrFZo7Ig",
        category: "escola"
    },
    {
        title: "Ciências",
        link: "https://www.youtube.com/watch?v=v0KGZx0C-wc",
        category: "escola"
    },

];

// Função para exibir vídeos
const displayVideos = (videos) => {
    const videosContainer = document.getElementById('videos-container');
    videosContainer.innerHTML = ''; // Limpa o contêiner

    videos.forEach((video) => {
        const videoDiv = document.createElement('div');
        const iframe = document.createElement('iframe');
        iframe.width = "600";
        iframe.height = "340";
        iframe.frameBorder = "0";
        iframe.allowFullscreen = true;
        const id = video.link.split('v=')[1];
        iframe.setAttribute("src", `https://www.youtube.com/embed/${id}?controls=0&autoplay=1`);

        videoDiv.appendChild(iframe);
        videosContainer.appendChild(videoDiv);
    });

    console.log('Vídeos exibidos com sucesso!');
}

// Função para buscar vídeos
const searchVideos = (query) => {
    const filteredVideos = allVideos.filter(item => item.title.toLowerCase().includes(query.toLowerCase()));
    displayVideos(filteredVideos);
}

// Função para filtrar vídeos por categoria
const filterVideosByCategory = (category) => {
    if (category === 'todas') {
        displayVideos(allVideos);
    } else {
        const filteredVideos = allVideos.filter(item => item.category === category);
        displayVideos(filteredVideos);
    }
}

// Adicionar eventos para o botão de busca
document.getElementById('search-button').addEventListener('click', () => {
    const query = document.getElementById('search-input').value;
    searchVideos(query);
});

// Adicionar evento para tecla ENTER no campo de busca
document.getElementById('search-input').addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        const query = document.getElementById('search-input').value;
        searchVideos(query);
    }
});

// Adicionar eventos para os botões de categorias
const categoryButtons = document.querySelectorAll('.category-button');
categoryButtons.forEach(button => {
    button.addEventListener('click', (event) => {
        const category = event.target.getAttribute('data-category');
        filterVideosByCategory(category);
    });
});

// Carregar vídeos ao carregar a página
window.onload = () => displayVideos(allVideos);
