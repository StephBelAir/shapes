module.exports = {
  purge: [
    "./src/**/*.{html,ts}",
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      colors:{
        'cyan-blue': '#3F525C',
      },
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
